/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadsynchronized;

import racecondition.BaseForRaceCondition;

/**
 *
 * @author Umman Hasan
 */
public class MyConsumerForSynchronized implements Runnable
{

    String name;

    public MyConsumerForSynchronized(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("I am started and waiting");
        try {
            Thread.sleep(2000);// 2 saniyelik gozleme edirik
        } catch (InterruptedException ex) {

        }
        
        BaseForRaceCondition.incA();
//        System.out.println("Umman= " + BaseForRaceCondition.a);
    }
}
