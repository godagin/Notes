package net.Goda.notebook;

import java.awt.*;
import java.util.Date;

public abstract class Note implements Customizable {

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


    public Note(){this(new String());}

    public Note(String text){this.text = text;}

    public Note(String text, String author){
        this(text);
        this.author = author;
    }


    //*************************************************


    public void setFont(Font font){ this.font = font; }

    public Font getFont(){ return font; }

    public void setFontSize(int fontSize){ this.fontSize = fontSize; }

    public int getFontSize(){ return fontSize; }

    public void setBold(boolean isBold){ this.isBold = isBold; }

    public boolean getBoldStatus(){ return isBold; }

    public void setItalic(boolean isItalic){ this.isItalic = isItalic; }

    public boolean getItalicStatus(){ return isItalic; }




    public void setColor(Color color){ this.color = color; }
    public Color getColor(){ return color; }
    public void setTextColor(Color textColor){ this.textColor = textColor; }
    public Color getTextColor(){ return textColor; }


    //*************************************************


    public Date getCreationDate(){return creationDate;}

    public String getAuthor(){return author;}

    public String getText(){return text;}

    public void setAuthor(String author){this.author = author;}

    public void setText(String text){this.text = text;}

    public abstract void clearData();

}



