package activities;

import android.animation.LayoutTransition;
import android.app.ActionBar;
import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.tutos.android.ui.R;

public class LoginDisplayActivity extends Activity {

	final String EXTRA_LOGIN = "user_login";
	final String EXTRA_PASSWORD = "user_password";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_display);

       Intent intent = getIntent();
       TextView loginDisplay = (TextView) findViewById(R.id.email_display);
       TextView passwordDisplay = (TextView) findViewById(R.id.password_display);

       if (intent != null) {
    	   loginDisplay.setText(intent.getStringExtra(EXTRA_LOGIN));
    	   passwordDisplay.setText(intent.getStringExtra(EXTRA_PASSWORD));
       }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.login_display, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_search:
                // Comportement du bouton "Recherche"

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
