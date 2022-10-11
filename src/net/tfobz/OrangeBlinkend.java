package net.tfobz;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class OrangeBlinkend implements Zustand{

    public OrangeBlinkend(){
        Ampel.getInstance().orangeBlinkenEin();
    }
    @Override
    public void ein() {
        Ampel.getInstance().zustand = new Orange();
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
