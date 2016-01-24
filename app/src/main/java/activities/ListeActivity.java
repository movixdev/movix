package activities;

import android.app.Activity;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.tutos.android.ui.R;

import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;

import adapter.FilmAdapter;
import fragment.ListFilmFragment;
import models.MovieEntity;

/**
 * Created by isen on 16/01/2016.
 */
public class ListeActivity extends Activity implements ListFilmFragment.OnArticleSelectedListener {


    ListView listView;
    FilmAdapter adapter;
    public ListeActivity listeActivity =null;
    public ArrayList<MovieEntity> listViewValueArr = new ArrayList<MovieEntity>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_main);

        listeActivity =this;
        // take some data in ArrayList
        setListData();
        Resources res = getResources();
        listView = (ListView)findViewById(R.id.list);

        // Create custom adapter

        adapter=new FilmAdapter(listeActivity, listViewValueArr,res);
        listView.setAdapter(adapter);

        //getFragmentManager().beginTransaction().add(R.id.container, new ListFilmFragment()).commit();

    }

    private void setListData() {
        for (int i=0;i<11;i++){
            final MovieEntity sched = new MovieEntity();

            //take data in model object
            sched.setTitle("Titre"+i);
            sched.setPoster_path("image"+i);

            //take Model Object
            listViewValueArr.add(sched);
        }
    }
    public void onItemClick(int mPosition){
        MovieEntity tempValues = (MovieEntity)listViewValueArr.get(mPosition);

        //Show alert

    }


    @Override
    public void onArticleSelectedListener(Uri uri) {

        //Call Method on Fragment B
    }
}
