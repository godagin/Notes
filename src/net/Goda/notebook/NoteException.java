package net.Goda.notebook;

public class NoteException extends Exception{
    protected Note note;

    public NoteException(Note note, String message){
        super(message);
        this.note = note;
    }

    public Note getNote(){
        return this.note;
    }
}
