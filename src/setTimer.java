
import java.awt.Button;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JTextField;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermeguia
 */
public class setTimer {
    String songName;
    JTextField upField;
    Button bTurnEnabled;
    int h,m,s;
    boolean isRunn = false;
    initClock clock = new initClock(h,m,s);
    Timer cdTimer = new Timer();
    TimerTask task = new TimerTask(){
        public void run(){
            if(s == 0 && m >= 1){
                    m--;
                    s=60;
                }else if(m == 0 && h >= 1){
                    m=60;
                    h--;
                }
                
                if(s == 0 && m >=1){
                    m--;
                    s = 60;
                }
                if(m == 60 && s ==0){
                    m = 59;
                    s = 60;
                }
                s--;
                upField.setText(h + ":" + m + ":" + s);
                if(h == 0 && m == 0 && s == 0){
                    cdTimer.cancel();
                    upField.setText("00:00:00");
                    if(songName != "None"){
                        new playSound(songName);
                    }
                    bTurnEnabled.setEnabled(true);
                }
                if(h == 0 && m == 30 && s == 0){
                    bTurnEnabled.setEnabled(true);
                }
        }
    };
    
    public setTimer(JTextField field, Button b, int h1, int m1, int s1, boolean isRunn1, String sName){
        upField = field;
        h = h1;
        m = m1;
        s = s1;
        isRunn = isRunn1;
        bTurnEnabled = b;
        sName = sName.replaceAll(" ", "");
        songName = sName;
    }
}
