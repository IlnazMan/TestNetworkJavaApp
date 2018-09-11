package data.mapper;

import data.models.PokeResponse;
import domain.mappers.Mapper;
import domain.models.Pokemon;

public class PokeMapper implements Mapper<PokeResponse, Pokemon> {
    @Override
    public Pokemon convertFrom(PokeResponse t2) {
        return new Pokemon(t2.getId(), t2.getName(), t2.getBaseExperience(), t2.getHeight(), t2.getWeight());
    }

    @Override
    public PokeResponse convertTo(Pokemon t1) {
        return null;
    }
}
