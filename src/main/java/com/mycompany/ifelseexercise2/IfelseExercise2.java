/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifelseexercise2;

/**
 *
 * @author arsha
 */
public class IfelseExercise2 {

    public static void main(String[] args) {
        boolean isMale = true;
        boolean isTall = false;
        
        if(isMale && isTall){
        
            System.out.print("You are a tall male ");
            
        }
        else if (!isMale && isTall){
        System.out.println("You are not a male but you are tall");
        }
        
        else{
            System.out.println("Are are not a male ");
        }
    }
}
