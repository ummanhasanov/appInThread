/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myworker;

/**
 *
 * @author Umman Hasan
 */
public class MainOfMyWorker
{

    public static void main(String[] args) {
        // Here we wrote in order
        MyWorker m1 = new MyWorker("Name=1");
        MyWorker m2 = new MyWorker("Name=2");
        MyWorker m3 = new MyWorker("Name=3");
        MyWorker m4 = new MyWorker("Name=4");
        MyWorker m5 = new MyWorker("Name=5");
        MyWorker m6 = new MyWorker("Name=6");

        //But here it will print random
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
        m6.start();

    }

}
