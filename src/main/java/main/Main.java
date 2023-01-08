/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import main.thread.MyConsumer;
import main.thread.MyProducer;

/**
 *
 * @author Umman Hasan
 */
public class Main
{
    public static void main(String[] args) {
        Thread p1 = new Thread(new MyProducer());
        Thread p2 = new Thread(new MyProducer());
        
        Thread c1 = new Thread(new MyConsumer("Name1"));
        Thread c2 = new Thread(new MyConsumer("Name2"));
        Thread c3 = new Thread(new MyConsumer("Name3"));
        Thread c4 = new Thread(new MyConsumer("Name4"));
        Thread c5 = new Thread(new MyConsumer("Name5"));
        
        p1.start();
        p2.start();
        
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
    }
}
