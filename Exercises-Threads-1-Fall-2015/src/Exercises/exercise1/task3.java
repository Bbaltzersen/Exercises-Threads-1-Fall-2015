/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises.exercise1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bbalt
 */
public class task3 extends Thread{
    
    public void run() {
        long start = System.currentTimeMillis();
        long end = start + 10000;
        int i = 9;
        while(System.currentTimeMillis() < end){
            i++;
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                
            }
            
        }  
    }

}
