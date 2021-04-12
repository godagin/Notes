package net.Goda.notebook;

import java.awt.*;

public interface Customizable extends Colorable{

    void setFont(Font font);
    Font getFont();
    void setFontSize(int Size);
    int getFontSize();
    void setBold(boolean isBold);
    boolean getBoldStatus();
    void setItalic(boolean isItalic);
    boolean getItalicStatus();

}
