/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) {
        fixedThreadPool();
    }

    private static void singleThreadExecutor() {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Future f = service.submit(new MyRunnable(1)); // thread
        service.submit(new MyRunnable(2)); //1 thread
        service.submit(new MyRunnable(3)); //1 thread
        service.submit(new MyRunnable(4)); //1 thread
        service.submit(new MyRunnable(5)); //1 thread
        service.submit(new MyRunnable(6)); //1 thread
        // Future has new functionality like as cancel, isCancelled, isDone et.c.
//       f.isCancelled(); 
    }

    private static void fixedThreadPool() {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            service.submit(new MyRunnable(i));
        }
    }

}
