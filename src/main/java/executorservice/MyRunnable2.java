/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package executorservice;

/**
 *
 * @author Umman Hasan
 */
public class MyRunnable2 implements Runnable
{

    private int index;

    public MyRunnable2(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        doIt();
    }

    public void doIt() {
        System.out.println(index + ".runnable started and will wait 3 seconds");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Runnable finished");
    }

}
