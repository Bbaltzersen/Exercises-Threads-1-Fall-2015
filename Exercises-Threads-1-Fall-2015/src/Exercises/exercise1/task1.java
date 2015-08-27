/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercises.exercise1;
import java.util.*;
/**
 *
 * @author bbalt
 */
public class task1 extends Thread{
    public void run(){
        
        long sum = 0;
        for(long l = 1; l <= Math.pow(10, 9) ; l++) {
            sum += l;
        }
        System.out.println(sum);
    }
}
