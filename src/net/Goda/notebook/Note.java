package net.Goda.notebook;

import java.awt.*;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public abstract class Note implements Customizable, Cloneable, Serializable {

    private String text;
    private String author;
    private Date creationDate = new Date();

    private Font font = new Font("Arial", Font.PLAIN, 12);
    private boolean isBold = false;
    private boolean isItalic = false;

    private Color color = Color.WHITE;
    private Color textColor = Color.BLACK;

    public static ArrayList<Thread> threadList = new ArrayList<>();

    //*************************************************


    public Note(String text){this.text = text;}

    public Note(String text, String author){
        this(text);
        this.author = author;
    }


    //*************************************************


    @Override
    public void setFont(Font font){ this.font = font; }

    @Override
    public Font getFont(){ return font; }

    @Override
    public void setBold(boolean isBold){ this.isBold = isBold; }

    @Override
    public boolean getBoldStatus(){ return isBold; }

    @Override
    public void setItalic(boolean isItalic){ this.isItalic = isItalic; }

    @Override
    public boolean getItalicStatus(){ return isItalic; }



    @Override
    public void setColor(Color color){ this.color = color; }

    @Override
    public Color getColor(){ return color; }

    @Override
    public void setTextColor(Color textColor){ this.textColor = textColor; }

    @Override
    public Color getTextColor(){ return textColor; }


    //*************************************************


    @Override
    public Note clone(){
        Note clone = null;
        try {
            clone = (Note) super.clone();
            //clone.text = new String(this.text);
            //clone.author = new String(this.text);
            clone.creationDate = (Date) this.creationDate.clone();
            clone.font = new Font(this.font.getAttributes());

            clone.color = new Color(this.color.getRGB());
            clone.textColor = new Color(this.textColor.getRGB());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    //*************************************************

    public Date getCreationDate(){return creationDate;}

    public String getAuthor(){return author;}

    public String getText(){return text;}

    public void setAuthor(String author){this.author = author;}

    public void setText(String text) {
        this.text = text;
    }

    public void saveNote(File outputFile){
        Thread thread = new Thread(new NoteWriter(this, outputFile));
        thread.start();
        threadList.add(thread);
    }

    public static void joinThreads() {
        for(Thread thread : threadList){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //public abstract void clearData();

}



