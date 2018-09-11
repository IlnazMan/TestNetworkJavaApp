package data.utils;

import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

/**
 * Network utils for
 */
public class NetworkUtils {

    private static OkHttpClient client;
    private static Retrofit retrofit;

    /**
     * method initializes a okhttpclient
     *
     * @return okhttp-instance
     */
    private static synchronized OkHttpClient client() {
        if (client == null) {
            client = new OkHttpClient.Builder()
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .readTimeout(10, TimeUnit.SECONDS)
                    .writeTimeout(10, TimeUnit.SECONDS)
                    .build();
        }
        return client;
    }

    /**
     * method initializes retrofit-client
     *
     * @param client
     * @param url
     * @return
     */
    private static synchronized Retrofit retrofit(OkHttpClient client, String url) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
                    .baseUrl(url)
                    .build();
        }
        return retrofit;
    }

    /**
     * method creates Api instance for params
     *
     * @param clazz    - class-object of Api-interface
     * @param retrofit - retrofit-client
     * @param <T>      - type of interface
     * @return typed client for requests
     */
    private static <T> T getApi(Class<T> clazz, Retrofit retrofit) {
        return retrofit.create(clazz);
    }

    /**
     * method creates Api instance for params
     *
     * @param tClass - class-object of Api-interface
     * @param url    - URL-string
     * @param <T>    - type of interface
     * @return typed client for requests
     */

    public static <T> T buildApi(Class<T> tClass, String url) {
        return getApi(tClass, retrofit(client(), url));
    }
}
