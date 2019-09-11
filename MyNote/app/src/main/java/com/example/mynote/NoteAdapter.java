package com.example.mynote;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mynote.models.Note;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class NoteAdapter extends BaseAdapter {
    private ArrayList<Note> notes;

    public NoteAdapter(ArrayList<Note> notes) {
        this.notes = notes;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getCount() {
        return notes.size();
    }

    @Override
    public Object getItem(int i) {
        Note note = notes.get(i);
        return note;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        View viewItemNote = LayoutInflater.from(context).inflate(R.layout.note_item_view, viewGroup, false);
        Note note = notes.get(i);
        TextView txtContent = viewItemNote.findViewById(R.id.txtContent);
        TextView txtCreatedDate = viewItemNote.findViewById(R.id.txtCreatedDate);
        ImageView imageViewIsImportant = viewItemNote.findViewById(R.id.imageViewIsImportant);
        txtContent.setText(note.getContent());
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
        txtCreatedDate.setText(dateFormat.format(note.getCreatedDate()));
        if (note.getImportant()) {
            imageViewIsImportant.setBackgroundColor(Color.RED);
            //imageViewIsImportant.setImageResource(R.drawable.ic_launcher_background);
        }
        return viewItemNote;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
}
