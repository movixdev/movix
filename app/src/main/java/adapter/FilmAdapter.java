
package adapter;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutos.android.ui.R;

import java.util.ArrayList;
import java.util.List;

import activities.ListeActivity;
import activities.TVApplication;
import models.MovieEntity;
import pojo.Film;

/**
 * Created by isen on 20/01/2016.
 */
public class FilmAdapter extends BaseAdapter implements View.OnClickListener {

    // Declare Used Variables
    private Activity activity;
    private ArrayList data;
    private static  LayoutInflater inflater = null;
    public Resources res;
    MovieEntity tempValues = null;
    int i=0;

    // CustomAdapter Constructor
    public FilmAdapter(Activity a, ArrayList d, Resources resLocal){
        // Take passed Values
        activity = a;
        data =d;
        res = resLocal;
        // Layout inflator to call external xml layout
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        if(data.size() <= 0)
            return 1;
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        ViewHolder holder;

        if (convertView==null){
            // Inflate fragment_one_film for each row
            view = inflater.inflate(R.layout.fragment_one_film,null);

            // View holder objet to contain
            holder = new ViewHolder();
            holder.filmName=(TextView) view.findViewById(R.id.filmName);
            holder.image = (ImageView)view.findViewById(R.id.imageViewFilm);
            view.setTag(holder);

        }
        else
            holder=(ViewHolder)view.getTag();
        if (data.size()<=0){
            holder.text.setText("No Data");
        }
        else
        {
            //get each Model objet from ArrayList
            tempValues=null;
            tempValues = (MovieEntity)data.get(position);

            //Set Model Values in Holder elements

            holder.filmName.setText(tempValues.getTitle());
            //holder.image.setImageResource(res.getIdentifier(""));
            // Set Item Click Listner for LayoutInflater for each row
            view.setOnClickListener(new OnItemClickListener(position));
        }
        return view;
    }



    @Override
    public void onClick(View v) {
        Log.v("CustomAdapter","Row button clicked");
    }
    // called when item click on ListView
    private class OnItemClickListener implements View.OnClickListener{

        private int mPosition;
        OnItemClickListener(int position){
            mPosition = position;
        }
        @Override
        public void onClick(View v) {
            ListeActivity sct = (ListeActivity)activity;
            //Call onItemClick methode inside ListActivity
            sct.onItemClick(mPosition);
        }
    }

    public static class ViewHolder {
        public ImageView image;
        public TextView filmName;
        public TextView alias;
        public TextView text;


       /* public ViewHolder(View view) {
            image = (ImageView) view.findViewById(R.id.imageViewFilm);
            filmName = (TextView) view.findViewById(R.id.filmName);

        }*/
    }
}
