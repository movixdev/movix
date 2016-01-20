package fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;


import com.squareup.picasso.Picasso;
import com.tutos.android.ui.R;

import java.util.ArrayList;

/**
 * Created by isen on 17/01/2016.
 */
public class ListFilmFragment extends ListFragment {

    OnArticleSelectedListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.liste_film_root_fragment, container, false);

        return rootView;
    }

    public interface OnArticleSelectedListener{
        public void onArticleSelectedListener (Uri uri);
    }



}
