/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operar;

/**
 *
 * @author vmontestovar
 */
public class Operar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Programa pro=new Programa();
         System.out.println("Escribe 2 numeros");
        short numero1;
        short numero2;
        numero1=pro.pedirNum();
        numero2=pro.pedirNum();
        pro.operacion(numero1, numero2);
        
        // TODO code application logic here
    }
    
}
