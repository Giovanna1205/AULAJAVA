/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13;

import java.util.Scanner;

/**
 *
 * @author 17932453631
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nm;
        int resto;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o número:");
        nm = ler.nextInt();
        nm= nm%2;
        resto = nm;
        if (resto > 0){
            System.out.println("O número informado é ímpar.");
        }else{
            System.out.println("O número informado é par");
      
        }
    }
    
}
