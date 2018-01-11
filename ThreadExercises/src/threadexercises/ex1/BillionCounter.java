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
public class BillionCounter extends Thread{
    
    @Override
    public void run(){
        int numberToSum = 1000000000;
        long sum = 0;
        for (int i = 1; i <= numberToSum ; i++) {
            
            sum += i;
            System.out.println("THREAD 1 - This is number: " + i + " of 1 billion the sum is: " + sum);
            try {
                sleep(500);
            } catch (Exception e) {
            }
            
            
        }
    }
}
