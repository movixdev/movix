package activities;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;


import com.tutos.android.ui.R;

import java.util.List;
import java.util.Set;

import models.MovieEntity;
import retrofit2.Callback;
import retrofit2.Response;
import service.response.SearchMovieResponse;

public class LoginDisplayActivity extends Activity {

    final String EXTRA_LOGIN = "user_login";
    final String EXTRA_PASSWORD = "user_password";
    private String query;

    TextView titleView;
    TextView taglineView;
    TextView release_dateView;
    TextView overviewView;
    ImageView posterpathView;
    TextView original_languageView;
    TextView vote_averageView;
    TextView ResultatTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_display);
        //Movie with id_known
        //getMovieTest();
        //SearchMovie();
        // Intent i = getIntent();
//searchMovie(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.login_display, menu);
        // Associate searchable configuration with the SearchView
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));
        return true;
    }

    @Override
    protected void onNewIntent(Intent intent) {

        String query = intent.getStringExtra(SearchManager.QUERY);
        Log.i("TEST", query);

        String query2 = intent.getExtras().getString(SearchManager.QUERY);
        Log.i("TEST", query2);

        searchMovie(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                // Comportement du bouton "Recherche"
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void searchMovie(Intent intent) {


        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            //use the query to search your data somehow

            TVApplication.getTmdbService().searchMovie(query, "0d1d0cc3c4aec9ca1c2c8c9e781a7ef1").enqueue(new Callback<SearchMovieResponse>() {

                @Override
                public void onResponse(Response<SearchMovieResponse> response) {
                    List<MovieEntity> results = response.body().getResults();
                    Log.i("TEST", "Got " + results.size() + " results from TMDB");
                    System.out.println("Test2");
                }

                @Override
                public void onFailure(Throwable t) {

                }
            });
        }
    }


    public void getMovieTest() {
  /*      vote_averageView = (TextView)findViewById(R.id.vote_average);
        titleView = (TextView) findViewById(R.id.title);
        taglineView = (TextView) findViewById(R.id.tagline);
        release_dateView = (TextView) findViewById(R.id.release_date);
        overviewView = (TextView) findViewById(R.id.overview);
        posterpathView = (ImageView) findViewById(R.id.poster_path);
        original_languageView = (TextView) findViewById(R.id.original_language);
*/
        TVApplication.getTmdbService().getMovie(273248, "0d1d0cc3c4aec9ca1c2c8c9e781a7ef1").enqueue(new Callback<MovieEntity>() {
            @Override
            public void onResponse(Response<MovieEntity> response) {
                String title = response.body().title;
                String tagline = response.body().tagline;
                String overview = response.body().overview;
                String release_date = response.body().release_date;
                String original_language = response.body().original_language;
                Float vote_average = response.body().vote_average;
                int id = response.body().id;

                titleView.setText(title.toString());
                taglineView.setText(tagline.toString());
                overviewView.setText(overview.toString());
                release_dateView.setText(release_date.toString());
                original_languageView.setText(original_language.toString());
                vote_averageView.setTextSize(vote_average.floatValue());

            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });
    }
}