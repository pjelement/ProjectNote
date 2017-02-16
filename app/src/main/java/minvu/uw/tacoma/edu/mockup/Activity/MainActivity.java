package minvu.uw.tacoma.edu.mockup.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import minvu.uw.tacoma.edu.mockup.Fragment.SignInFragment;
import minvu.uw.tacoma.edu.mockup.R;
import minvu.uw.tacoma.edu.mockup.Utils.DownloadData;

public class MainActivity extends AppCompatActivity
        implements SignInFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.fragment_container)!= null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, new SignInFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, settings.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    /* These function below belongs to SignInFragment - Start
    * */

    @Override
    public void SendingLogin(String url) {
        DownloadData task = new DownloadData();
        task.execute(url);
    }
    //END
}
