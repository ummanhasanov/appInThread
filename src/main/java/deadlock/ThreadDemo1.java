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
public class ThreadDemo1 extends Thread
{

    @Override
    public void run() {
        synchronized (lock1) {
            System.out.println("Thread1: Holding lock 1...");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread1: Waiting for lock 2...");

            //in thread1 waiting for lock2 => it is deadlock
            synchronized (lock2) {
                System.out.println("Thread1: Holding lock 1 & 2...");
            }
        }
    }
}
