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
public class mainExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread taskOne = new task1();
        Thread taskTwo = new task2();
        Thread taskThree = new task3();
        
        taskOne.start();
        taskTwo.start();
        taskThree.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
        }
    }
    
}
