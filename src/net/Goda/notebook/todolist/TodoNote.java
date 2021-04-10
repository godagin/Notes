package net.Goda.notebook.todolist;

import net.Goda.notebook.Note;

import java.util.Date;


public class TodoNote extends Note {

    private boolean isDone = false;
    private Date dueDate;

    public TodoNote(){
        super();
    }
    public TodoNote(Date dueDate){
        super();
        this.dueDate = dueDate;
    }
    public TodoNote(String text, String author, Date dueDate){
        super(text, author);
        this.dueDate = dueDate;
    }

    public void setDone(boolean setStatus){ isDone = setStatus; }

    public Date getDueDate() { return dueDate; }

    public boolean getStatus(){ return isDone; }

    public void setDueDate(Date date){ dueDate = date; }

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

    @Override
    public void clearData() {
        isDone = false;
        dueDate = null;
        super.clearData();
    }
}
