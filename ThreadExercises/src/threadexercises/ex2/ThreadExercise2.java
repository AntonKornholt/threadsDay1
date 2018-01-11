/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexercises.ex2;

import java.util.concurrent.atomic.AtomicInteger;

/*

The error occurs in my code yes. It does not happen every time. But somtimes it happens a lot. I tested mostly with 10000 calls of even.next.
By making the method next synchronised I can make sure that both threads don't affect n at the same time.
This is because the threads can't go and get the 'n' value while it is being changed by the other thread.
*/

public class ThreadExercise2 implements Runnable{
    
    public static void main(String[] args) {
    
    
    int numberOfLoops = 10000000;
    Even e = new Even();
    Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= numberOfLoops; i++) {
                if (e.next() % 2 != 0) {
                    System.out.println("The number was not even in Thread 1 for loop: "+ i);
                    
                }
            }
            System.out.println("If you see this text the method next worked in thread 1");
        });
    Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= numberOfLoops; i++) {
                if (e.next() % 2 != 0) {
                    System.out.println("The number was not even in Thread 2 for loop: "+ i);
                    
                }
            }
            System.out.println("If you see this text the method next worked in thread 2");
        });    
        
    thread1.start();
    thread2.start();
        
    }
    

    @Override
    public void run() {
        
    }
    
}

class Even{
    
    private int n = 0;

    public synchronized Integer next() {
        n++;
        n++;
        return n;
    }
}
