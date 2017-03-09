
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URISyntaxException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermeguia
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, URISyntaxException {
        //create the form itself
        principalForm form = new principalForm();
        form.setVisible(true);
    }

}
