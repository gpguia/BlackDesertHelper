import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermeguia
 */
   
// To play sound using Clip, the process need to be alive.
// Hence, we use a Swing application.
public class playSound extends JFrame {
   // Constructor
   public playSound(String soundName) {
   
      try {
         // Open an audio input stream.
         URL url = this.getClass().getClassLoader().getResource("resources/sounds/" + soundName +".wav");
         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
   }
}
