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
public class ExcerciseOne extends Thread{
    
     
     
     public static void main(String[] args) {

        BillionCounter thread1 = new BillionCounter();
        OneToFive_TwoSecondsPause thread2 = new OneToFive_TwoSecondsPause();
        FromTenAndUp thread3 = new FromTenAndUp();
        thread1.start();
        thread2.start();
        thread3.start();
        
         try {
             System.out.println("Main thread is sleeping for 10 seconds");
             sleep(10000);
         } catch (Exception ex) {
             System.out.println("Problems with main thread sleeping occured!");
         }
         System.out.println("Finished sleeping for 10 seconds");
         FromTenAndUp.setStop(true);
         System.out.println("Stopped thread 3");
        
    }   
    
}
