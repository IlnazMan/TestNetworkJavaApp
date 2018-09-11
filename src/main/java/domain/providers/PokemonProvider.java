package domain.providers;

import domain.models.Pokemon;

/**
 * Interface will be implemented by class which provides pokemon (from internet, file etc.).
 */
public interface PokemonProvider {
    /**
     * method is providing Pokemon by some id
     *
     * @param id - id of pokemon
     * @return Pokemon
     */
    Pokemon getPokemonById(int id);
}
