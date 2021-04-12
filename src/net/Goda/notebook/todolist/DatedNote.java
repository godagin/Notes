package net.Goda.notebook.todolist;

import java.util.Date;

public interface DatedNote{

    Date getReminderDate();
    void setReminderDate(Date date);
    Date getDueDate();
    void setDueDate(Date date);

}
