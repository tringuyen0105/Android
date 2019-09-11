package com.example.mynote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mynote.models.Note;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listViewNotes;
    private ArrayList<Note> notes = new ArrayList<>();
    private NoteAdapter noteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Note");

        setupUI();
    }

    private void setupUI() {
        generateFakeNotes();
        listViewNotes = findViewById(R.id.listViewNotes);
        noteAdapter = new NoteAdapter(notes);
        listViewNotes.setAdapter(noteAdapter);

        listViewNotes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Note note = notes.get(position);
                Toast.makeText(MainActivity.this, "name ="+note.getContent(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    private void generateFakeNotes () {
        notes.add(new Note(1, "Hoc Android", true));
        notes.add(new Note(2, "Di sieu thi", false));
        notes.add(new Note(3, "Hoc Java", true));
        notes.add(new Note(4, "Len phong may", false));
        notes.add(new Note(5, "Lau don nha", true));
    }
}
