package domain.usecases;

import domain.models.Pokemon;
import domain.providers.DataProvider;

public class GetAllDataUseCase {
    private DataProvider provider;

    public GetAllDataUseCase(DataProvider provider) {
        this.provider = provider;
    }

    public Pokemon getPokemonById(int id) {
        return provider.getPokemonById(id);
    }
}
