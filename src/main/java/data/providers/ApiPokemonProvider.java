package data.providers;

import data.Api;
import data.mapper.PokeMapper;
import data.models.PokeResponse;
import data.utils.NetworkUtils;
import domain.models.Pokemon;
import domain.providers.PokemonProvider;

import java.io.IOException;

/**
 * Pokemon provider from API
 */

public class ApiPokemonProvider implements PokemonProvider {

    private Api api;

    public ApiPokemonProvider() {
        api = NetworkUtils.buildApi(Api.class, Api.URL);
    }

    @Override
    public Pokemon getPokemonById(int id) {
        Pokemon response = null;
        try {
            PokeResponse responseBody = api.getPokemonById(id).execute().body();
            if (responseBody != null)
                response = new PokeMapper().convertFrom(responseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
