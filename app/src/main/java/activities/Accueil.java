package activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tutos.android.ui.R;

/**
 * Created by isen on 15/01/2016.
 */
public class Accueil extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.accueil);

        //Boutton Accueil
        final Button button = (Button) findViewById(R.id.buttonaccueil);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //On va sur une autre activité
                Intent intent = new Intent(Accueil.this, ConnectionActivity.class);
                startActivity(intent);

            }
        });



    }
}
