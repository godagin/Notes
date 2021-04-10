package net.Goda.notebook.notelist;

import net.Goda.notebook.Note;


import java.awt.*;
import java.util.Date;

public class PersonalNote extends Note {

    private NoteType noteType = NoteType.DEFAULT;
    private Color color = Color.WHITE;
    private int importance = 0;

    public PersonalNote(){
        super();
    }
    public PersonalNote(String text, String author){
        super(text, author);
    }
    public PersonalNote(String text, String author, Date date){
        super(text, author, date);
    }
    public PersonalNote(String text, String author, NoteType type, int importance){
        this(text, author);
        noteType = type;
        assignColorByType();
        this.importance = importance;
    }
    public PersonalNote(String text, String author, Date date, NoteType type, int importance){
        this(text, author, date);
        noteType = type;
        assignColorByType();
        this.importance = importance;
    }
    private void assignColorByType(){
        switch(noteType){
            case PERSONAL:
                color = new Color(255, 255,153);
                break;
            case WORK:
                color = new Color(204,255,255);
                break;
            case HOBBY:
                color = new Color(255, 204, 229);
                break;
            default:
                color = Color.WHITE;
                break;
        }
    }

    public void setNoteType(NoteType noteType) {
        this.noteType = noteType;
        assignColorByType();
    }
    public void setImportance(int importance){ this.importance = importance; }

    public NoteType getNoteType(){ return noteType; }

    public int getImportance(){ return importance; }

    public Color getColor() { return color; }

    @Override
    public String toString(){
        String toString;
        toString = getClass().getName() + '@' + Integer.toHexString(hashCode()) +
                " Note: " + getText() + " -" + getAuthor() +
                " Type: " + getNoteType() + " Color: " + getColor() +
                " Created: " + getCreationDate() + " Reminder: " + getReminderDate();
        return toString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalNote personalNote = (PersonalNote) o;

        if(noteType == personalNote.noteType &&
                getText() == personalNote.getText() &&
                getAuthor() == personalNote.getAuthor() &&
                getReminderDate() == personalNote.getReminderDate()){
            return true;
        }
        return false;
    }

    @Override
    public void clearData() {
        noteType = NoteType.DEFAULT;
        color = Color.WHITE;
        importance = 0;
        super.clearData();
    }
}

/*
TodoNote ir personalNote sukurti paveldejimu
Pasirinkto projekto kontekste sudaryti klasių hierarchiją bent iš trijų paveldėjimo ryšiais susijusių klasių. Išvestinės klasės privalo:

    Kitos klasės privalo pasinaudoti sukurtų klasių polimorfiniu
    elgesiu (kviesti užklotus metodus bazinio tipo nuorodai)

    Užkloti Object metodą toString() ir dar bent vieną metodą (equals uzklojau, netikrinu tik sukurimo datos)
    Visos projekto klasės privalo priklausyti bent 2 skirtingiems paketams
    Pasinaudoti bazinės klasės konstruktoriumi super()
    Turėti papildomų metodų ir laukų
    Pasinaudoti bazinės klasės super-metodu.
    Bazinė klasė privalo turėti metodų, kuriuos draudžiama užkloti
*/


