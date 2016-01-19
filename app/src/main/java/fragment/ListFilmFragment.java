package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.tutos.android.ui.R;

/**
 * Created by isen on 17/01/2016.
 */
public class ListFilmFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.liste_film_root_fragment,container,false);
    }

   /* @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Fragment List Picasso

        ImageView imageView;
        imageView = (ImageView)view.findViewById(R.id.imageView);
        //Picasso.with(getBaseContext()).load("http://i.imgur.com/DvpvklR.png").fit().centerCrop().into(imageView);

    }*/
}
