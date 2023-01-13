/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package executorservice;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    public static void main(String[] args) throws InterruptedException {
//        fixedThreadPool();
//        singleThreadExecutor();
//        cashedTheadPool();
//        scheduledThreadPool();

        System.out.println("Run/...");
        ExecutorService service = Executors.newSingleThreadExecutor();

        MyCallable[] arr = new MyCallable[3];
        arr[0] = new MyCallable(1);
        arr[1] = new MyCallable(2);
        arr[2] = new MyCallable(3);

        service.invokeAll(Arrays.asList(arr));//invokeAll => step by step , invokeAny => ordan burdan

        List<Future<Object>> list = service.invokeAll(Arrays.asList(arr));
        
        Future f = list.get(0);
        
        service.shutdown();
        service.awaitTermination(10, TimeUnit.SECONDS);
        
        System.out.println("some codes are here waiting awaitTermination");

    }

    private static void scheduledThreadPool() throws InterruptedException {

        ScheduledExecutorService ex = Executors.newScheduledThreadPool(2);
        ex.schedule(new MyRunnable(1), 0, TimeUnit.SECONDS);
        ex.schedule(new MyRunnable(1), 0, TimeUnit.SECONDS);

    }

    private static void cashedTheadPool() {
        ExecutorService service1 = new ThreadPoolExecutor(10,
                15, 10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(20));
        ExecutorService service2 = Executors.newCachedThreadPool();// as parameter we put our MyCustomThreadFactory
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
        service.shutdown();

    }

    private static void fixedThreadPool() {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            service.submit(new MyRunnable(i));
        }

        service.shutdown();
    }

}
