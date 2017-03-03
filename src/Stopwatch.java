
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermeguia
 */
public class Stopwatch {
    String songName;
    JTextField upField;
    int flag;
    initClock clock = new initClock(0,0,0);
    Timer runTime = new Timer();
    TimerTask task = new TimerTask(){
        public void run(){
            clock.s++;
            if(clock.s == 60){
                clock.m++;
                clock.s = 0;
            }else if(clock.m == 60){
                clock.h++;
                clock.m=0;
            }
            
            upField.setText(clock.h + ":" + clock.m + ":" + clock.s);
        
            if(clock.m == 10){
                new playSound(songName);
                runTime.cancel();
            }
        }
    };
     
    public Stopwatch(JTextField field,String sName){
        upField = field;
        sName = sName.replaceAll(" ", "");
        songName = sName;
    }
}
