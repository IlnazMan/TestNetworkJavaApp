package presentation;

import data.providers.ApiPokemonProvider;
import domain.models.Pokemon;
import domain.usecases.GetPokemonByIdUseCase;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain {


    public static void main(String[] args) {
        System.out.println("Enter pokemon id:");
        //new TestMain().testPokemonApiProvider();
        new TestMain().generateGroups();
    }

    /**
     * group generator
     */
    private void generateGroups() {
        List<Integer> list = Stream.iterate(1, integer -> integer + 1)
                .limit(3)
                .collect(Collectors.toList());
        Collections.shuffle(list, new Random());
        System.out.println(list);
    }

    private void testPokemonApiProvider() {
        GetPokemonByIdUseCase useCase = new GetPokemonByIdUseCase(new ApiPokemonProvider());
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Pokemon pokemon = useCase.getPokemonById(i);
        System.out.println(pokemon!=null?pokemon:"Sorry.. Not found..");
    }
}
