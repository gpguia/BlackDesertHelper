
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
    JTextField upField;
    int flag;
    initClock clock = new initClock(0,0,0);
    Timer runTime = new Timer();
    TimerTask task = new TimerTask(){
        public void run(){
            if(clock.s == 60){
                clock.m++;
                clock.s = 0;
            }else if(clock.m == 60){
                clock.h++;
                clock.m=0;
            }
            clock.s++;
            upField.setText(clock.h + ":" + clock.m + ":" + clock.s);
        }
    };
     
    public Stopwatch(JTextField field){
        upField = field;
    }
}
