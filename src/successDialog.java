
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
public class successDialog {
    
    public successDialog(String title, String msg){
        // create our jframe
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");

        // show a joptionpane dialog using showMessageDialog
        JOptionPane.showMessageDialog(frame, 
        msg, 
        title, 
        JOptionPane.INFORMATION_MESSAGE,
        new ImageIcon(getClass().getClassLoader().getResource("resources/img/successImg.png")));
    }
}
