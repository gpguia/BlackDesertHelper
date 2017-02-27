
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
    int h;
    int m;
    int s;
    
    Timer cdTimer = new Timer();
    
        /*cdClock.schedule(new TimerTask() {
            @Override public void run() {
                
            }
        }, 10, 10);
    */
    
    
    // Constructor
    public cdTimer(){
        h = 0;
        m = 30;
        s = 0;
    }
    
    
}
