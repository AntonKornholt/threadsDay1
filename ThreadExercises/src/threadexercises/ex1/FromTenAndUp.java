/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexercises.ex1;

/**
 *
 * @author Kornh
 */
public class FromTenAndUp extends Thread{
    
    private volatile static boolean stop;
    
    public FromTenAndUp(){
        
    }
    
    public void run(){
    long i = 10L;
            while (!stop) {
                System.out.println("THREAD - 3 - From 10 and up: " + i);
                i++;
                try {
                    System.out.println("Thread3 is sleeping for 3 sec.");
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    System.out.println("InterruptedException with Thread3!");
                }
            }
  }

    public static boolean isStop() {
        return stop;
    }

    public static void setStop(boolean stop) {
        FromTenAndUp.stop = stop;
    }
    
    
}
