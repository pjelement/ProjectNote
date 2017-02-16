package minvu.uw.tacoma.edu.mockup.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import minvu.uw.tacoma.edu.mockup.R;

public class LoginByEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_by_email);
    }

    public void finallySignIn(View view) {
        Intent intent = new Intent(this, NoteActivity.class);
        startActivity(intent);
    }
}
