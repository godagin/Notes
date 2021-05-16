package net.Goda.notebook.notelist;

import net.Goda.notebook.Note;


import java.awt.*;
import java.io.Serializable;


public class PersonalNote extends Note implements Serializable {

    private NoteType noteType = NoteType.DEFAULT;

    private int importance = 0;


    //*************************************************


    public PersonalNote(String text){
        super(text);
    }

    public PersonalNote(String text, String author){
        super(text, author);
    }

    public PersonalNote(String text, String author, NoteType type){
        super(text, author);
        noteType = type;
        assignColorByType();
    }
    public PersonalNote(String text, String author, NoteType type, int importance){
        this(text, author, type);
        this.importance = importance;
    }


    //*************************************************


    private void assignColorByType(){
        switch(noteType){
            case WORK:
                setColor(new Color(204,255,255));
                break;
            case HOBBY:
                setColor(new Color(255, 204, 229));
                break;
            default:
                setColor(Color.WHITE);
                break;
        }
    }


    //*************************************************


    public void setNoteType(NoteType noteType) {
        this.noteType = noteType;
        assignColorByType();
    }

    public NoteType getNoteType(){ return noteType; }

    public void setImportance(int importance){ this.importance = importance; }

    public int getImportance(){ return importance; }




    //*************************************************


    @Override
    public String toString(){
        String toString;
        toString = "Note: " + getText() + " - " + getAuthor() +
                "\nType: " + getNoteType() +
                "\nCreated: " + getCreationDate();
        return toString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalNote personalNote = (PersonalNote) o;

        if(noteType == personalNote.noteType &&
                getText() == personalNote.getText() &&
                getAuthor() == personalNote.getAuthor()){
            return true;
        }
        return false;
    }



    //*************************************************


}



