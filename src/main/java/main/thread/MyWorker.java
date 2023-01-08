/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

/**
 *
 * @author Umman Hasan
 */
public class MyWorker extends Thread
{

    String name;

    public MyWorker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is procesed");
    }
}
