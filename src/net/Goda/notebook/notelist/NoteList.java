package net.Goda.notebook.notelist;

import net.Goda.notebook.Note;

import java.util.ArrayList;

public class NoteList {
    private ArrayList<Note> noteList = new ArrayList<>();

    public void addNote(Note note){
        noteList.add(note);
    }

    public Note getNote(int index){
        return noteList.get(index);
    }

}