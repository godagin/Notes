package net.Goda.notebook.todolist;

import net.Goda.notebook.Note;

import java.awt.*;
import java.util.Date;


public class TodoNote extends Note implements DatedNote {

    private boolean isDone = false;
    private Date dueDate;
    private Date reminderDate;
    private final Date creationDate = new Date();


    //*************************************************


    public TodoNote(){
        super();
    }

    public TodoNote(String text){
        super(text);
    }

    public TodoNote(String text, String author){
        super(text, author);
    }

    public TodoNote(String text, String author, Date reminderDate){
        this(text, author);
        this.reminderDate = reminderDate;
    }

    public TodoNote(String text, String author, Date reminderDate, Date dueDate){
        this(text, author, reminderDate);
        this.dueDate = dueDate;
    }


    //*************************************************


    public void setDone(boolean setStatus){ isDone = setStatus; }

    public boolean getStatus(){ return isDone; }


    //*************************************************


    @Override
    public String toString(){
        String toString;
        toString = getClass().getName() + '@' + Integer.toHexString(hashCode()) +
                " Note: " + getText() + " -" + getAuthor() +
                " Created:" + getCreationDate() + " Due: " + dueDate + " Is done:" + isDone;
        return toString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoNote todoNote = (TodoNote) o;
        if(isDone == todoNote.isDone &&
                getText() == todoNote.getText() &&
                getAuthor() == todoNote.getAuthor() &&
                getReminderDate() == todoNote.getReminderDate()){
            return true;
        }
        return false;
    }


    //*************************************************


    @Override
    public Date getReminderDate(){ return reminderDate; }

    @Override
    public final void setReminderDate(Date date){ reminderDate = date; }

    @Override
    public Date getDueDate(){ return dueDate; }

    @Override
    public void setDueDate(Date date){ dueDate = date; }

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

}
