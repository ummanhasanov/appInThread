/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

/**
 *
 * @author Umman Hasan
 */
public class MyConsumer implements Runnable
{

    String name;

    public MyConsumer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            int lastIndex = Base.list.size() - 1;
            System.out.println("last index=" + lastIndex);
            if (lastIndex > -1) {
                String s = Base.list.remove(lastIndex);
                System.out.println(name + "=" + s);
            }
        }
    }
}
