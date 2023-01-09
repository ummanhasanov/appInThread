/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadsynchronized;

import racecondition.BaseForRaceCondition;
import racecondition.MyConsumerForRaceCondition;

/**
 *
 * @author Umman Hasan
 */
public class MainForSynchronized
{

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread count = " + Thread.activeCount());
        System.out.println("All thread are starting");
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(new MyConsumerForRaceCondition("Name=1"));
        }

        for (int i = 0; i < 100; i++) {
            threads[i].start();
        }
        System.out.println("Thread count = " + Thread.activeCount());

        // with race condition <= 100
        Thread.sleep(5000);// 5 saniyelik gozleme edirik
//        System.out.println(BaseForRaceCondition.a);

        // with synchronized method == 100
        System.out.println(BaseForRaceCondition.getA());
    }
}
