package com.example;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class Main extends MIDlet{
    public void destroyApp(boolean arg0)
    {
        notifyDestroyed();
    }

    protected void pauseApp ()
    {

    }
    protected void startApp () throws MIDletStateChangeException
    {
        Form form = new Form("Hello World");
        String msg = "Hello World!";
        form.append(msg);
        Display display = Display.getDisplay(this);
        display.setCurrent(form);
    }
}
