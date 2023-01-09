/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitorandlock;

/**
 *
 * @author Umman Hasan
 */
public class MainMonitorAndLock
{

    public static void main(String[] args) {

        MyProducerMonitorAndLock m = new MyProducerMonitorAndLock();
        m.doIt1();
        System.out.println();
        m.doIt2();
        System.out.println();
        m.doIt3();
    }
}
