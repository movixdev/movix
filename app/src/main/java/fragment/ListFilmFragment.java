package fragment;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.ListFragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;


import com.squareup.picasso.Picasso;
import com.tutos.android.ui.R;

import java.util.ArrayList;

import pojo.Film;

/**
 * Created by isen on 17/01/2016.
 */
public class ListFilmFragment extends Fragment {

    OnArticleSelectedListener listener;
    private ListView mListView;

    public ListFilmFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.liste_film_root_fragment, container, false);
        mListView = (ListView) rootView.findViewById(R.id.list);

        //Progresse Bar
        final ProgressBar progressBar = new ProgressBar(getActivity());
        progressBar.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT, Gravity.CENTER));
        progressBar.setIndeterminate(true);
        mListView.setEmptyView(progressBar);

        // Add the view in our content view
        ViewGroup root = (ViewGroup) rootView.findViewById(R.id.RootRelativeLayout);
        root.addView(progressBar);


        return rootView;
    }

    public interface OnArticleSelectedListener{
        public void onArticleSelectedListener (Uri uri);
    }



}
