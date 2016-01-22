package asyncTask;

import android.os.AsyncTask;
import android.text.TextUtils;


import java.util.ArrayList;
import java.util.List;

import pojo.Film;

/**
 * Created by isen on 21/01/2016.
 */
public class DownloadFilm extends AsyncTask<String,Void, List<Film>> {

    List<String> list = new ArrayList<String>(){{add("one"); add("two"); add("three");}};


    @Override
    protected List<Film> doInBackground(String... params) {
        if (TextUtils.isEmpty(params[0])) {
            return null;
        } else {
            return null;  /// Mettre la base de donnée
        }

    }
}