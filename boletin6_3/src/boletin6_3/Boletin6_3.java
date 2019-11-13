/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

/**
 *
 * @author vmontestovar
 */
public class Boletin6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numeros num= new Numeros();
        System.out.println("escribe un numero");
       float numer;
       numer=num.pedirNum();
        num.numero(numer);
        
       
       
    }
}

