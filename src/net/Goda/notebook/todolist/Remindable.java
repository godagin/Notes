package net.Goda.notebook.todolist;

import java.util.Date;

public interface Remindable {

    Date getReminderDate();
    void setReminderDate(Date date) throws NoteDateException;
    Date getDueDate();
    void setDueDate(Date date) throws NoteDateException;

}
