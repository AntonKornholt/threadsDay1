/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexercises.ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kornh
 */
public class OneToFive_TwoSecondsPause extends Thread{
    
    @Override
    public void run(){
        int sleepTime = 2000;
        int startNumber = 1;
        int stopNumber = 5;
        
        for (int i = startNumber; i <= stopNumber; i++) {
            System.out.println("THREAD - 2 - This is number: " + i);
            try {
                sleep(sleepTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(OneToFive_TwoSecondsPause.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
