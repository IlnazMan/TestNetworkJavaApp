package data.providers;

import data.Api;
import data.mapper.PokeMapper;
import data.models.PokeResponse;
import data.utils.NetworkUtils;
import domain.models.Pokemon;
import domain.providers.DataProvider;

import java.io.IOException;

public class ApiDataProvider implements DataProvider {

    private Api api;

    public ApiDataProvider() {
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
