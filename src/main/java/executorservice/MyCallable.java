/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package executorservice;

import java.util.concurrent.Callable;

/**
 *
 * @author Umman Hasan
 */
public class MyCallable implements Callable<Object>
{

    private int index;

    public MyCallable(int index) {
        this.index = index;
    }

    @Override
    public Object call() throws Exception {
        doIt();
        return this;
    }

    public void doIt() {
        System.out.println(index + ".callable started and will wait 3 seconds");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Callable finished");
    }

}
