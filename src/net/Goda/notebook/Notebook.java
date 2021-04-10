package net.Goda.notebook;

import net.Goda.notebook.notelist.NoteList;
import net.Goda.notebook.todolist.TodoList;

/*
 4. Personalinė užrašų sistema: adresai, užrašai, darbai, kalendorius;
    Notes, Tasks, Calendar, Adresses?/
 */
public class Notebook {
    private NoteList notes;

    private TodoList todoList;

    private static int notebookCount = 0;

    public Notebook(NoteList notes, TodoList todoList){
        this.notes = notes;
        this.todoList = todoList;
        notebookCount++;
    }
    public Notebook(){
        this(new NoteList(), new TodoList());
    }

    public static int getNotebookCount() {
        return notebookCount;
    }

    public NoteList getNotes() {
        return notes;
    }

    public void setNotes(NoteList notes) {
        this.notes = notes;
    }


}



