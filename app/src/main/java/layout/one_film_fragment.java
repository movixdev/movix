package layout;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.tutos.android.ui.R;

import fragment.ListFilmFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class one_film_fragment extends Fragment {


    public one_film_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=  inflater.inflate(R.layout.fragment_one_film, container, false);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();

        ListFilmFragment filmFragment = new ListFilmFragment();
        fragmentTransaction.add(R.id.root_film_fragment,filmFragment);
        fragmentTransaction.commit();


        // Fragment List Picasso

        /*ImageView imageView;
        imageView = (ImageView)findViewById(R.id.imageView);
        Picasso.with(getBaseContext()).load("http://i.imgur.com/DvpvklR.png").fit().centerCrop().into(imageView);
        */
        return view;
    }

}
