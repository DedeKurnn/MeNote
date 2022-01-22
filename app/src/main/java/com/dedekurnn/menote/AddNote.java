package com.dedekurnn.menote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
//import android.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;

public class AddNote extends AppCompatActivity {

    Toolbar toolbar;
    EditText noteTitle, noteDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        noteTitle = findViewById(R.id.noteTitle);
        noteDetail = findViewById(R.id.noteDetail);
    }
}