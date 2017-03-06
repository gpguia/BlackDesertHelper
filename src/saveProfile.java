
import java.io.File;
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
        String folder = "BdoHelper";
        String osName = System.getProperty("os.name");
        //Will create the file in the same directory as the jar file.
        String fileName = "profile" + nP;
        String myDocumentPath;
        if(osName.startsWith("Mac")){
            myDocumentPath = System.getProperty("user.home") + "/Documents";
            folder = myDocumentPath + "/BdoHelper";
            fileName = myDocumentPath + "/BdoHelper" + "/profile" + nP;
        }else if(osName.startsWith("Windows")){
            myDocumentPath = System.getProperty("user.home") + "\\Documents";
            folder = myDocumentPath + "\\BdoHelper";
            fileName = myDocumentPath + "\\BdoHelper" + "\\profile" + nP;
        }  
        
        
        //Create a dir
        File theDir = new File(folder);
        // if the directory does not exist, create it
        if (!theDir.exists()) {
        //System.out.println("creating directory: " + folder);
        boolean result = false;

        try{
            theDir.mkdir();
            result = true;
        } 
        catch(SecurityException se){
            //Do nothing the folder exsists
        }        
        if(result) {    
           // System.out.println("DIR created");  
        }
        }
        
        //Write the config in a file.
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