// Goda Gintalaite 2gr.

/*
    TEMA: Personalinė užrašų sistema: adresai, užrašai, darbai, kalendorius;
*/


import net.Goda.notebook.Note;
import net.Goda.notebook.NoteException;
import net.Goda.notebook.NoteFactory;
import net.Goda.notebook.notelist.NoteType;
import net.Goda.notebook.notelist.PersonalNote;
import net.Goda.notebook.todolist.NoteDateException;

import net.Goda.notebook.todolist.TodoNote;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args){


        File file = new File("savedData.txt");

        for(int i=0; i<50; i++){
            Note note = new TodoNote("lalala"+i, "bababa"+i);
            note.saveNote(file);

        }
        Note.joinThreads();
        Note test = NoteFactory.readNote(file);
        System.out.println("\n\nTEST.1 :       "+test.toString());

        test = NoteFactory.readNote(file);
        System.out.println("\n\nTEST.2 :       "+test.toString());
        /*
        Calendar calendar = Calendar.getInstance();

        calendar.set(2021, 06, 05);
        Date due = calendar.getTime();

        TodoNote original = null;

        original = new TodoNote("Laba diena","Goda", due, due);


        TodoNote copy = original.clone();
        //System.out.println(original.toString());
        //System.out.println(copy.toString());

        //System.out.println(original.getReminderDate() == copy.getReminderDate());
        System.out.println(original.getReminderDate());
        System.out.println(copy.getReminderDate());

        //calendar.setTime(original.reminderDate);
        //calendar.add(Calendar.DATE, 1);
        //original.reminderDate.setTime(calendar.getTime().getTime());

        System.out.println(original.getReminderDate());
        System.out.println(copy.getReminderDate());

        System.out.println("original.getText() == copy.getText() " + (original.getText() == copy.getText()));


        System.out.println(original.getFont() == copy.getFont());
        System.out.println(original.getColor() == copy.getColor());
        System.out.println(original.getTextColor() == copy.getTextColor());
        System.out.println(original.getReminderDate() == copy.getReminderDate());
        System.out.println(original.getDueDate() == copy.getDueDate());

        Note test = NoteFactory.createNote("personal");
        //System.out.println(test.toString());

        Note test2 = NoteFactory.createNote("todo");
        //System.out.println(test2.toString());
        */
        /*
        Calendar calendar = Calendar.getInstance();

        calendar.set(2021, 02, 05);
        Date reminder = calendar.getTime();

        calendar.set(2021, 03, 01);
        Date due = calendar.getTime();

        TodoNote note = null;

        try {
            note = new TodoNote("", "autorius", reminder, due);

        } catch(NoteDateException e) {
            e.printStackTrace();
            System.out.println("Wrong date: " + e.getdate());

        } catch (NoteException e){
            e.printStackTrace();
        }

        try {
            note = new TodoNote("Geras tekstas", "autorius", reminder, due);

        } catch (NoteDateException e) {
            e.printStackTrace();
            System.out.println("Wrong date: " + e.getdate());

        } catch (NoteException e){
            e.printStackTrace();
        }

        calendar.set(2021,05,05);
        due = calendar.getTime();

        try {
            note = new TodoNote("Geras tekstas", "autorius", reminder, due);

        } catch (NoteDateException e) {
            e.printStackTrace();
            System.out.println("Wrong date: " + e.getdate());

        } catch (NoteException e){
            e.printStackTrace();
        }

/*

 /*       //treciam atsiskaitymui

        Calendar calendar = Calendar.getInstance();
        calendar.set(2023,11,9);
        Date date = calendar.getTime();

        TodoNote todo1 = new TodoNote();
        todo1.setAuthor("GODA");
        todo1.setText("ATSISKAITAU DARBA");
        todo1.setReminderDate(date);
        //todo1.setDone(true);
        System.out.println(todo1.toString());

        PersonalNote personal1 = new PersonalNote("LALA", "A");
        personal1.setNoteType(NoteType.WORK);

        PersonalNote personal2 = new PersonalNote("LALA", "A");
        personal2.setNoteType(NoteType.WORK);
        System.out.println(personal1.equals(personal2));
        System.out.println(personal1.equals(todo1));

        System.out.println(personal1.getNoteType());

        Note a;
        System.out.println(a.toString());
*/


    }
}

