package net.Goda.notebook;

import net.Goda.notebook.notelist.NoteType;
import net.Goda.notebook.notelist.PersonalNote;
import net.Goda.notebook.todolist.TodoNote;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class NoteFactory {
    private NoteFactory(){

    }
    public static Note createNote(String type){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.WEEK_OF_YEAR, 1);
        Date dueDate = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, -1);
        Date reminderDate = calendar.getTime();
            if (type == "personal") {
                return new PersonalNote("[text here]", "default");
            } else if (type == "todo") {
                return new TodoNote("[text here]", "default", reminderDate, dueDate);
            } else {
                return null;
            }
    }
    public static Note readNote(File inputFile){
        NoteReader noteReader = new NoteReader(inputFile);
        Thread thread = new Thread(noteReader);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return noteReader.getNote();
    }

}
