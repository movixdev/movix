package activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.tutos.android.ui.R;

/**
 * Created by isen on 16/01/2016.
 */
public class ListeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_main);



        // Fragment List Picasso

        //ImageView imageView;
        //imageView = (ImageView)findViewById(R.id.imageView);
       // Picasso.with(getBaseContext()).load("http://i.imgur.com/DvpvklR.png").fit().centerCrop().into(imageView);

    }


}
