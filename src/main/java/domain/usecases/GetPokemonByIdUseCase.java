package domain.usecases;

import domain.models.Pokemon;
import domain.providers.PokemonProvider;

public class GetPokemonByIdUseCase {
    private PokemonProvider provider;

    public GetPokemonByIdUseCase(PokemonProvider provider) {
        this.provider = provider;
    }

    public Pokemon getPokemonById(int id) {
        return provider.getPokemonById(id);
    }
}
