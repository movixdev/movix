package activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.tutos.android.ui.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConnectionActivity extends Activity {

	Button subscribeButton, registerButton;


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.connection_user);
		subscribeButton = (Button) findViewById(R.id.create_account);
		registerButton = (Button) findViewById(R.id.connect);
		loginOrRegister();
	}

	public void loginOrRegister(){
		subscribeButton.setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						if (v.getId() == R.id.create_account) {

							Intent i = new Intent(ConnectionActivity.this, SubscribeActivity.class);
							startActivity(i);
						}
					}
				}
		);
		registerButton.setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {

                        if(v.getId() == R.id.connect){

                            Intent i = new Intent(ConnectionActivity.this, LoginDisplayActivity.class);
                            startActivity(i);
                        }

					}
				}
		);
	}






		/*
		//Boutton pour entrer dans l'appli
		final Button loginButton = (Button) findViewById(R.id.connect);
		loginButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				final String loginTxt = login.getText().toString();
				final String passTxt = pass.getText().toString();

				if (loginTxt.equals("") || passTxt.equals("")) {
					Toast.makeText(ConnectionActivity.this,
							R.string.email_or_password_empty,
							Toast.LENGTH_SHORT).show();
					return;
				}

				Pattern p = Pattern.compile(".+@.+\\.fr+");
				Matcher m = p.matcher(loginTxt);
				// Si l'adresse mail saisie ne correspond au format d'une adresse mail
				if (!m.matches()) {
					// Toast est une classe fournie par le SDK Android pour afficher les messages dans des minis pop up
					// Le premier argument est le Context, puis le message et à la fin la durée de ce dernier
					Toast.makeText(ConnectionActivity.this,
							R.string.email_format_error, Toast.LENGTH_SHORT)
							.show();
					return;
				}

				Intent intent = new Intent(ConnectionActivity.this,
						LoginDisplayActivity.class);
				intent.putExtra(EXTRA_LOGIN, loginTxt);
				intent.putExtra(EXTRA_PASSWORD, passTxt);
				startActivity(intent);
			}
		});
		//Boutton pour créer un compte
		final Button registerButton = (Button) findViewById(R.id.create_account);
		registerButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ConnectionActivity.this,FormActivity.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}*/


}
