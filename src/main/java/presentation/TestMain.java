package presentation;

import data.providers.ApiDataProvider;
import domain.usecases.GetAllDataUseCase;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain {


    public static void main(String[] args) {
        GetAllDataUseCase useCase = new GetAllDataUseCase(new ApiDataProvider());
        //System.out.println(useCase.getAllData());

        List<Integer> list = Stream.iterate(1, integer -> integer + 1)
                .limit(15)
                .collect(Collectors.toList());
        Collections.shuffle(list, new Random());
        System.out.println(list);

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println(useCase.getPokemonById(i));
    }
}
