
import java.util.Timer;
import java.util.TimerTask;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermeguia
 */
public class cdTimer {
    initClock clock = new initClock(0,30,0);
    Timer cdTimer = new Timer();
    TimerTask task = new TimerTask(){
        public void run(){
            if(clock.s == 0 && clock.m >= 1){
                    clock.m--;
                    clock.s=60;
                }else if(clock.m == 0 && clock.h >= 1){
                    clock.m=60;
                    clock.h--;
                }
                
                if(clock.s == 0 && clock.m >=1){
                    clock.m--;
                    clock.s = 60;
                }
                clock.s--;
        }
    };
}
