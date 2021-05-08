package net.Goda.notebook;

import java.awt.*;
import java.io.*;
import java.util.Date;

public abstract class Note extends Thread implements Customizable, Serializable {

    private String text;
    private String author;
    private final Date creationDate = new Date();

    private Font font;
    private int fontSize = 12;
    private boolean isBold = false;
    private boolean isItalic = false;

    private Color color = Color.WHITE;
    private Color textColor = Color.BLACK;


    //*************************************************


    public Note(String text){this.text = text;}

    public Note(String text, String author){
        this(text);
        this.author = author;
    }


    //*************************************************


    @Override
    public void run() {

        try {
            File outputFile = new File("savedData.txt");
            if(!outputFile.exists()){
                outputFile.createNewFile();
            }
            FileOutputStream fileOut = new FileOutputStream(outputFile);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occurred.");
        }

    }

    @Override
    public void setFont(Font font){ this.font = font; }

    @Override
    public Font getFont(){ return font; }

    @Override
    public void setFontSize(int fontSize){ this.fontSize = fontSize; }

    @Override
    public int getFontSize(){ return fontSize; }

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

/*
    @Override
    public Note clone(){
        Note clone = null;
        try {
            clone = (Note) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
*/

    //*************************************************

    public Date getCreationDate(){return creationDate;}

    public String getAuthor(){return author;}

    public String getText(){return text;}

    public void setAuthor(String author){this.author = author;}

    public void setText(String text) {
        this.text = text;
    }

    //public abstract void clearData();

}



