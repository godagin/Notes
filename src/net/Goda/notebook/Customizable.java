package net.Goda.notebook;

import java.awt.*;

public interface Customizable extends Colorable{

    void setFont(Font font);
    Font getFont();
    void setBold(boolean isBold);
    boolean getBoldStatus();
    void setItalic(boolean isItalic);
    boolean getItalicStatus();

}
