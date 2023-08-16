/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09;

import java.util.Scanner;

/**
 *
 * @author Giovanna
 */
public class Aula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        System.out.println("Informe um número inteiro:");
        int numero=ler.nextInt();
        
         if (numero > 0) 
         {
             System.out.println("O número informado é positivo.");
         }
         else if(numero < 0) 
         {
             System.out.println("O número informado é negativo.");
         }
         else 
         {
           System.out.println("O número é igual a zero.");
         }
           
                 
       
    }
    
}
