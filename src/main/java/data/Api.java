package data;

import data.models.PokeResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {

    String URL = "http://pokeapi.co/";

    @GET("/api/v2/pokemon/{id}/")
    Call<PokeResponse> getPokemonById(@Path("id") int id);
}
