package activities;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;
import com.tutos.android.ui.R;

import fragment.ListFilmFragment;

/**
 * Created by isen on 16/01/2016.
 */
public class ListeActivity extends Activity implements ListFilmFragment.OnArticleSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_main);

        getFragmentManager().beginTransaction().add(R.id.container, new ListFilmFragment()).commit();

    }


    @Override
    public void onArticleSelectedListener(Uri uri) {

        //Call Method on Fragment B
    }
}
