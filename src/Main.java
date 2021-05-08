// Goda Gintalaite 2gr.

/*
    TEMA: Personalinė užrašų sistema: adresai, užrašai, darbai, kalendorius;
*/


import net.Goda.notebook.NoteException;
import net.Goda.notebook.todolist.NoteDateException;

import net.Goda.notebook.todolist.TodoNote;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args){
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
        a = new Note("TEST TEST TEST", "123 NOTE", date);
        System.out.println(a.toString());
        a.clearData();
        System.out.println(a.toString());
        a = new PersonalNote("LA LA LA", "123 PERSONAL", date);
        System.out.println(a.toString());
        a.clearData();
        System.out.println(a.toString());
        a = new TodoNote("TODO", "123 TODO", date);
        System.out.println(a.toString());
        a.clearData();
        System.out.println(a.toString());
*/

/*
        //pirmam atsiskaitymui
        Note note1 = new Note();
        note1.println();
        note1.setAuthor("Goda");
        note1.setText("Atsiskaitau darba");
        note1.setReminderDate(2022,0, 19);
        System.out.println("Pirmas note uzpildytas be valandinio patikslinimo:");
        note1.println();
        System.out.println("Pirmas note uzpildytas su val, min, sec (overloaded metodas):");
        note1.setReminderDate(2022,8, 18, 14, 25, 45);
        note1.println();

        Note note2 = new Note("message no. 1", "abc", 2021, 04, 01);
        System.out.println("Antras note:");
        note2.println();
        System.out.println("Get:");
        System.out.println(note2.getText());
        System.out.println(note2.getAuthor());
        System.out.println(note2.getCreationDate());
        System.out.println(note2.getReminderDate());

        System.out.println("Static metodas:");
        System.out.print( Note.getNoteCount() + " " + note1.getNoteCount());

        System.out.println(note1.toString());
*/

    }
}

