package activities; /**
 * Created by isen on 22/01/2016.
 */

import android.app.Application;
import android.content.Context;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;


public class TVApplication extends Application {
    private static Context context;
    private static TMDBService tmdbService;
    public static final String BASE_URL = "http://api.themoviedb.org/3";

    @Override
    public void onCreate() {
        super.onCreate();
        this.context = getApplicationContext();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        this.tmdbService = retrofit.create(TMDBService.class);
    }

    public static Context getContext() {
        return context;
    }

    public static TMDBService getTmdbService() {
        return tmdbService;
    }
}
