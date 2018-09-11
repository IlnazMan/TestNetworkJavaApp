package domain.providers;

import domain.models.Pokemon;

public interface DataProvider {
    Pokemon getPokemonById(int id);
}
