/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deadlock;

import static deadlock.TestThread.lock1;
import static deadlock.TestThread.lock2;

/**
 *
 * @author Umman Hasan
 */
public class ThreadDemo2 extends Thread
{

    @Override
    public void run() {
        synchronized (lock2) {
            System.out.println("Thread2: Holding lock 2...");
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread2: Waiting for lock 1...");
        }
        //in thread2 waiting for lock1 => it is deadlock
        synchronized (lock1) {
            System.out.println("Thread2: Holding lock 2 & 1... ");
        }
    }
}
