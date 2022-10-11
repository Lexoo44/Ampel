package net.tfobz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Orange implements Zustand{

    public Orange(){
        Ampel.getInstance().orangeEin();
        Timer timer = new Timer(orangeIntervall, new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                Ampel.getInstance().zustand = new Rot();
                if(Ampel.getInstance().auto == true){
                    Timer timer = new Timer(rotIntervall, new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            Ampel.getInstance().zustand = new Gruen();
                        }
                    });
                    
                    timer.setRepeats(false);
                    timer.start();
                }
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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void automatischSchalten() {
        // TODO Auto-generated method stub
        
    }
    
}
