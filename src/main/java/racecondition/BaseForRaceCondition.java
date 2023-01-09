/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racecondition;

/**
 *
 * @author Umman Hasan
 */
public class BaseForRaceCondition
{   
    //  volatile keyword is used to mark a field as "having a volatile value" 
    public static volatile int a = 0;
    
    // create a new method
    public static int getA(){
        return a;
    }
   
    // without race condition we will used synchronized keyword
    // for difference with race condition 
     public static void incA(){
        a++;
    }
}
