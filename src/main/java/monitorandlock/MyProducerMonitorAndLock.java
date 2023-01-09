/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitorandlock;

/**
 *
 * @author Umman Hasan
 */
public class MyProducerMonitorAndLock
{
    private Object monitor1 = new Object();
    private Object monitor2 = new Object();

    public void doIt1() {
        System.out.println("doIt1 started");
        synchronized (monitor1) { // monitor => monitoring
        System.out.println("doIt1");
        }                     
        System.out.println("doIt1 finished");
    }

    public void doIt2() {
        System.out.println("doIt2 started");
        synchronized (monitor1) {// thread 2 waited
            // thread 1 inside
        System.out.println("doIt2");
        } 
        System.out.println("doIt2 finished");
    }

    public void doIt3() {
        System.out.println("doIt3 started");
        // thread 3 waited thread 1, after thread 1 finished.
        synchronized (monitor2) { //Started race between thread 2 and thread 3.
            //if one of them started first other will wait another  
        System.out.println("doIt3");
        } 
        System.out.println("doIt3 finished");
    }
}
