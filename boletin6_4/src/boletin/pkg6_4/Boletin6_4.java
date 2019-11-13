/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg6_4;

/**
 *
 * @author vmontestovar
 */
public class Boletin6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peso pes=new Peso();
        System.out.println("escriba o seu nome e peso");
        String nome1;
         nome1=pes.pedirNome();
         float persoa1;
         persoa1=pes.pedirPesso();
        System.out.println("escriba o seu nome e peso");
        String nome2;  
     nome2=pes.pedirNome();
            float persoa2;
        persoa2=pes.pedirPesso();
        
        pes.pesar(persoa1,nome1,persoa2,nome2);
        // TODO code application logic here
      }
    }

