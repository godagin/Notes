package net.Goda.notebook.todolist;

import net.Goda.notebook.Note;
import net.Goda.notebook.NoteException;

import java.util.Date;

public class NoteDateException extends NoteException {
    private Date date;

    public NoteDateException(TodoNote note, String text, Date date){
        super(note, text);
        this.date = date;
    }

    public Date getdate(){ return date;}

}//metodai neturi nieko spausdinti
