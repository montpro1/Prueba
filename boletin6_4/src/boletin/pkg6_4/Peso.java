/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg6_4;

import java.util.Scanner;

/**
 *
 * @author vmontestovar
 */
public class Peso {
    Scanner sc=new Scanner(System.in);
    public void pesar(float persoa1,String nome1,float persoa2, String nome2){
        if (persoa1>persoa2){
            System.out.println((nome1+ " pesa :" +persoa1) );
        }
        else if (persoa1<persoa2){
                System.out.println(nome2+persoa2);
        }
            else 
            System.out.println("pesan igual");
        
        System.out.println("diferencia peso"+Math.abs(persoa1-persoa2));
                   
    }
       
            
        
    
    public float pedirPesso(){
        float persoa=sc.nextFloat();
   
        return persoa;
    }
        
        public String pedirNome(){
            String persoa=sc.next();
            return persoa;
            
                    
                   
       
           }     
}