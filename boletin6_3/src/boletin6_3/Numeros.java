/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

import java.util.Scanner;

/**
 *
 * @author vmontestovar
 */
public class Numeros {
    Scanner sc=new Scanner(System.in);
    
    public void numero(float numer){
        if (numer>0)
            System.out.println("+");
        
        
        else if (numer==0)
                  System.out.println("0");
                  
        else 
             System.out.println("-");
    
             }
          
           public float pedirNum(){
               
               float numer=sc.nextFloat();
               return numer;
           }
    
}
        
       
    
    
    

