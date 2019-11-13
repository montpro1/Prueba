/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operar;

import java.util.Scanner;

/**
 *
 * @author vmontestovar
 */
public class Programa {
    Scanner sc= new Scanner(System.in);
    
    public void operacion(short numero1,short numero2){
       
        if(numero1>numero2){
        System.out.println("la resta es "+(numero1-numero2));
        
        }
        
        System.out.println("la suma es "+(numero1+numero2));    
    }
   
    public short pedirNum(){
        short numero=sc.nextShort();
        
        return numero;
    }
    
}
    

