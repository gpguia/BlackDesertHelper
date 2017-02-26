
import java.util.TimerTask;
import java.util.Timer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermeguia
 */
public class runTimer {
    int h;
    int m;
    int s;
    //Timer to run to each food
    Timer stTimer = new Timer();
    TimerTask task  = new TimerTask(){
        public void run(){
            if(s == 0 && m >= 1){
                m--;
                s=60;
            }else if(m == 0 && h >= 1){
                m=60;
                h--;
            }
            s--;
            if(h==0 && m==0 && s==0){
                task.cancel();
            }
        }
    };
    
    //Constructor
    public runTimer(int h1, int m1, int s1){
     h = h1;
     m = m1;
     s = s1;
    }
}
