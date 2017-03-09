
import java.net.*;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Desktop;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermeguia
 */
public class checkUpdate {
    
    public checkUpdate (String currentVersion) throws IOException, URISyntaxException{
        String version = "0";
        URL oracle = new URL("https://cdn.rawgit.com/gpguia/BlackDesertHelper/ab7db599/releases/version.txt");
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                version = inputLine;
        }
        if(!version.matches(currentVersion)){
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            //Custom button text
            Object[] options = {"No, thanks",
                    "Yes, please"};
            int n = JOptionPane.showOptionDialog(frame,
            "Would you like to update ? \n"
            + "Your version: " + currentVersion + "\n"
            + "New version: " + version,
            "Check for updates",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);
            if(n == JOptionPane.NO_OPTION){
                if(Desktop.isDesktopSupported()){
                    Desktop.getDesktop().browse(new URI("https://github.com/gpguia/BlackDesertHelper/releases"));
                   }
            }
        }else{
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            // show a joptionpane dialog using showMessageDialog
            JOptionPane.showMessageDialog(frame, 
                "You are using the current version\n"
                + "Current version: " + version, 
                "Check for update", 
                JOptionPane.INFORMATION_MESSAGE,
            new ImageIcon(getClass().getClassLoader().getResource("resources/img/successImg.png")));
        }
    }
}
