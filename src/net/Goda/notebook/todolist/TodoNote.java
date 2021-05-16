package net.Goda.notebook.todolist;

import net.Goda.notebook.Note;
import net.Goda.notebook.NoteException;
import net.Goda.notebook.notelist.PersonalNote;

import java.io.Serializable;
import java.util.Date;


public class TodoNote extends Note implements Remindable, Cloneable, Serializable {

    private boolean isDone = false;
    private Date dueDate;
    private Date reminderDate;


    //*************************************************


    public TodoNote(String text) throws NoteException {
        super(text);
        if(text.equals("") || text == null) {
            throw new NoteException(this, "No text given to note.");
        }
    }

    public TodoNote(String text, String author) throws NoteException {
        super(text, author);
        if(text.equals("") || text == null){
            throw new NoteException(this, "No text given to note.");
        }
    }

    public TodoNote(String text, String author, Date dueDate) throws NoteException {
        this(text, author);

        if(dueDate.before(getCreationDate())){
            throw new NoteDateException(this, "Invalid due date.", dueDate);
        }else{
            this.dueDate = dueDate;
            this.reminderDate = dueDate;
        }
    }

    public TodoNote(String text, String author, Date reminderDate, Date dueDate) throws NoteException {
        this(text, author, dueDate);

        if(reminderDate.after(dueDate) || reminderDate.before(getCreationDate())){
            throw new NoteDateException(this, "Invalid reminder date.", reminderDate);
        } else {
            this.reminderDate = reminderDate;
        }
    }


    //*************************************************


    public void setDone(boolean setStatus){ isDone = setStatus; }

    public boolean getStatus(){ return isDone; }


    //*************************************************


    @Override
    public String toString(){
        String toString;
        toString = "Note: " + getText() + " - " + getAuthor() +
                "\nCreated: " + getCreationDate() + " Reminder: " + getReminderDate() +
                "\nDue: " + dueDate + " Is done: " + isDone;
        return toString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoNote todoNote = (TodoNote) o;
        if(isDone == todoNote.isDone &&
                getText().equals(todoNote.getText()) &&
                getAuthor().equals(todoNote.getAuthor()) &&
                getReminderDate() == todoNote.getReminderDate()){
            return true;
        }
        return false;
    }


    @Override
    public TodoNote clone() {

        //cloned.reminderDate = (Date) this.reminderDate.clone();
        //cloned.dueDate = (Date) this.dueDate.clone();
        return (TodoNote) super.clone();
    }


    //*************************************************


    @Override
    public Date getReminderDate(){ return reminderDate; }

    @Override
    public final void setReminderDate(Date date) throws NoteDateException {

        if(reminderDate.before(getCreationDate())){
            throw new NoteDateException(this, "Invalid reminder date.", date);
        }else{
            reminderDate = date;
        }
    }

    @Override
    public Date getDueDate(){ return dueDate; }

    @Override
    public void setDueDate(Date date) throws NoteDateException {

        if(dueDate.before(getCreationDate())){
            throw new NoteDateException(this, "Invalid due date.", date);
        }else{
            dueDate = date;
        }
    }


/*
    @Override
    public void clearData() {
        setText("");
        setAuthor("");
        isDone = false;
        dueDate = null;
        reminderDate = null;
        setBold(false);
        setItalic(false);
        setFontSize(12);
        setColor(Color.WHITE);
        setTextColor(Color.BLACK);
    }

 */

}
