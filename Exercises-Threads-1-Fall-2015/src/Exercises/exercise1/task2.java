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
public class task2 extends Thread{
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
