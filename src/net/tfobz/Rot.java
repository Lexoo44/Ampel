package net.tfobz;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Rot implements Zustand {

    public Rot() {
        Ampel.getInstance().rotEin();
    }

    @Override
    public void ein() {
        // TODO Auto-generated method stub
    }

    @Override
    public void aus() {
        Ampel.getInstance().zustand = new OrangeBlinkend();    
    }

    @Override
    public void manuellSchalten() {
        Ampel.getInstance().zustand = new Gruen();
    }

    @Override
    public void automatischSchalten() {
        // TODO Auto-generated method stub
        Ampel.getInstance().auto = true;
        Timer timer = new Timer(rotIntervall, new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                Ampel.getInstance().zustand = new Gruen();
            }
            
        });

        timer.setRepeats(false);
        timer.start();        
    }

}
