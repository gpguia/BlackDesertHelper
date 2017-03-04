
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermeguia
 */
public class saveProfile {
    
    public saveProfile(int nP, String sNameFood, String sNameStopwatch, String fn1, String fn2, String fn3){
        String osName = System.getProperty("os.name");
        //Will create the file in the same directory as the jar file.
        String fileName = "profile" + nP;
        String myDocumentPath;
        if(osName.startsWith("Mac")){        
            myDocumentPath = System.getProperty("user.home") + "/Documents";
            fileName = myDocumentPath + "/profile" + nP;
        }else if(osName.startsWith("Windows")){
            myDocumentPath = System.getProperty("user.home") + "\\Documents";
            fileName = myDocumentPath + "\\profile" + nP;
        }  
        try (PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
            new successDialog("Success","Your profile has been saved with success!");
            writer.println(sNameFood);
            writer.println(sNameStopwatch);
            writer.println(fn1);
            writer.println(fn2);
            writer.println(fn3);
        } catch (Exception e){
            new errorDialog("Error","Error code: 1001. Your file could not be saved, please contact the developers at: https://github.com/gpguia/BlackDesertHelper/issues");
        }
    }
}