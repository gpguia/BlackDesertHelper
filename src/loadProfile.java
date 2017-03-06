
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JComboBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermeguia
 */
public class loadProfile {
    
    public loadProfile(int nP, JComboBox songFood, JComboBox songStopwatch, JComboBox fn1, JComboBox fn2, JComboBox fn3){
        String folder = "BdoHelper";
        String osName = System.getProperty("os.name");
        String myDocumentPath;
        String fileName;
        String sFood,sStopwatch,foodName1,foodName2,foodName3;
        int i=0, flagFindProfile = 0;
        String []arrayNames;
        arrayNames = new String[10];
        fileName = "profile" + nP;
        
        if(osName.startsWith("Mac")){        
            myDocumentPath = System.getProperty("user.home") + "/Documents" + "/BdoHelper";
            fileName = myDocumentPath + "/profile" + nP;
        }else if(osName.startsWith("Windows")){
            myDocumentPath = System.getProperty("user.home") + "\\Documents" + "\\BdoHelper";
            fileName = myDocumentPath + "\\profile" + nP;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
                            arrayNames[i] = sCurrentLine;
                            //System.out.println(arrayNames[i]); Debug only
                            i++;
                            flagFindProfile = 1;
			}
                         
		} catch (Exception e) {
                    if(flagFindProfile != 0)
                        new errorDialog("Loading error","Erro code: 1002, when trying to load the profile, something is missing, please save it again.");
		}
        //System.out.println(flagFindProfile); Debug Only
        if(i == 5 && flagFindProfile == 1){
            songFood.setSelectedItem(arrayNames[0]);
            songStopwatch.setSelectedItem(arrayNames[1]);
            fn1.setSelectedItem(arrayNames[2]);
            fn2.setSelectedItem(arrayNames[3]);
            fn3.setSelectedItem(arrayNames[4]);
        }else if(flagFindProfile == 0){
            new errorDialog("Loading error","Erro code: 1003, this error occurred because the profile file is wrong or doesn't exist, please save it again and try to load it after it.");
        }
    
    
    }
    
}
