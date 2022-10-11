package net.tfobz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ampel extends AmpelComponent {
    private static final Ampel INSTANCE = new Ampel();
    Zustand zustand;
    protected boolean auto = false;

    public Ampel() {
        super();
        this.addEinKnopfListener(new EinKnopfListener());
        this.addAusKnopfListener(new AusKnopfListener());
        this.addManuellKnopfListener(new ManKnopfListener());
        this.addAutomatischKnopfListener(new AutoKnopfListener());
    }

    public static Ampel getInstance() {
        return INSTANCE;
	}
    
    class EinKnopfListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(Ampel.getInstance().zustand ==  null)
                Ampel.getInstance().zustand = new OrangeBlinkend();
            
            auto = false;
            Ampel.INSTANCE.zustand.ein();
        }
    }

    private class AusKnopfListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            auto = false;
            Ampel.getInstance().zustand.aus();
        }
    }

    private class ManKnopfListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            auto = false;
            Ampel.getInstance().zustand.manuellSchalten();
        }
    }

    private class AutoKnopfListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Ampel.getInstance().zustand.automatischSchalten();
        }
    }



}


