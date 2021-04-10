package net.Goda.notebook;

import java.util.Date;

public class Note {
    private String text;
    private String author;
    private final Date creationDate = new Date();
    private Date reminderDate;

    private static int noteCount = 0;

    public Note(){
        this(new String(), new String());
    }

    public Note(String text, String author){
        this.text = text;
        this.author = author;
        ++noteCount;
    }

    public Note(String text, String author, Date reminderDate){
        this.text = text;
        this.author = author;
        this.reminderDate = reminderDate;
        ++noteCount;
    }


    public Date getCreationDate() {
        return creationDate;
    }

    public Date getReminderDate() {
        return reminderDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public static int getNoteCount(){ return noteCount; }


    public final void setAuthor(String author) { this.author = author; }

    public void setText(String text) { this.text = text; }

    public final void setReminderDate(Date date){ reminderDate = date; }


    public void clearData(){
        text = "";
        author = "";
        reminderDate = null;
    }

} //string, autorius, sukurimo data, priminimo data



