package activities;


import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.tutos.android.ui.R;

import database.MovixUserDatabaseHelper;


/**
 * Created by koudm on 23/01/2016.
 */
public class SubscribeActivity extends Activity {
    MovixUserDatabaseHelper myDb;
    EditText name,firstname, login, pass, alias, age;
    Button submitButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_subscribe);

        myDb = new MovixUserDatabaseHelper(this);


        name = (EditText) findViewById(R.id.user_name);
        firstname = (EditText) findViewById(R.id.user_prenom);
        login = (EditText) findViewById(R.id.user_login);
        pass = (EditText) findViewById(R.id.user_password);
        alias = (EditText) findViewById(R.id.user_alias);
        age = (EditText) findViewById(R.id.user_age);
        submitButton = (Button) findViewById(R.id.submit);

        addUser();


    }
    public void addUser(){
        submitButton.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.addUser(name.getText().toString(), firstname.getText().toString(), login.getText().toString(), pass.getText().toString(), alias.getText().toString());
                        if (isInserted == true) {
                            Toast.makeText(SubscribeActivity.this, "Inscription reussie", Toast.LENGTH_LONG).show();
                           /* Intent i = new Intent(SubscribeActivity.this,AccueilActivity.class);
                            i.putExtra("UserName",name.getText().toString());
                            i.putExtra("UserFirstname", firstname.getText().toString());
                            i.putExtra("UserLogin", login.getText().toString());
                            i.putExtra("UserPassword", pass.getText().toString());
                            i.putExtra("UserAlias", alias.getText().toString());
                            i.putExtra("UserAge",age.getText().toString());*/
                        } else {

                            Toast.makeText(SubscribeActivity.this, "Erreur - Inscription failed", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

                return super.onOptionsItemSelected(item);
        }
    }

