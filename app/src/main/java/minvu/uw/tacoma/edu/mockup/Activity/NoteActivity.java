package minvu.uw.tacoma.edu.mockup.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import minvu.uw.tacoma.edu.mockup.R;

public class NoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
    }

    public void TransferToNewNote(View view) {
        Intent intent = new Intent(this, NewNoteActivity.class);
        startActivity(intent);
    }

    public void TransferToCurrentNote(View view) {
        Intent intent = new Intent(this, CurrentActivity.class);
        startActivity(intent);

    }
}
