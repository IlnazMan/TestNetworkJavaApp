package data.utils;

import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkUtils {

    private static OkHttpClient client() {
        return new OkHttpClient.Builder()
                .build();
    }

    private static Retrofit retrofit(OkHttpClient client, String url) {
        return new Retrofit.Builder()
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
                .baseUrl(url)
                .build();
    }

    private static <T> T getApi(Class<T> clazz, Retrofit retrofit) {
        return retrofit.create(clazz);
    }

    public static <T> T buildApi(Class<T> tClass, String url) {
        return getApi(tClass, retrofit(client(), url));
    }
}
