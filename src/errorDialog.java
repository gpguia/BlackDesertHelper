
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermeguia
 */
public class errorDialog {

    public errorDialog(String title, String msg){
        // create our jframe
    JFrame frame = new JFrame("JOptionPane showMessageDialog example");

    // show a joptionpane dialog using showMessageDialog
    /*JOptionPane.showMessageDialog(frame, 
        "Your RSS feed has been published", 
        "RSS Feed Published", 
        JOptionPane.INFORMATION_MESSAGE,
        new ImageIcon(ShowMessageDialogExample1.class.getResource("Feeds_Green_32x32.png")));
    */
        
        JOptionPane.showMessageDialog(frame,
        msg,
        title,
        JOptionPane.ERROR_MESSAGE);
        }
}
