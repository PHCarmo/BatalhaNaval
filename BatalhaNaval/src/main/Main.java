package main;

import view.JFMenu;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;

public class Main {
    public static AudioClip music;
    
    public static void main(String[] args) {
        try{
            music = Applet.newAudioClip(new File("src/media/song.wav").toURI().toURL());
            music.loop();
	}catch(MalformedURLException e){      
	    System.out.println("Erro. Verifique o diretorio de sons");      
	}    
        
        java.awt.EventQueue.invokeLater(() -> {
            new JFMenu(music).setVisible(true);
        });
    }
}