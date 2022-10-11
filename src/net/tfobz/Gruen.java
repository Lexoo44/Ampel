package net.tfobz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gruen implements Zustand {

    public Gruen() {
        Ampel.getInstance().gruenEin();
        // TODO Auto-generated method stub
        Timer timer = new Timer(gruenIntervall, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                Ampel.getInstance().zustand = new Orange();
            }

        });

        timer.setRepeats(false);
        timer.start();
    }

    @Override
    public void ein() {
        // TODO Auto-generated method stub

    }

    @Override
    public void aus() {
        // TODO Auto-generated method stub

    }

    @Override
    public void manuellSchalten() {
    }

    @Override
    public void automatischSchalten() {
        // TODO Auto-generated method stub

    }

}
