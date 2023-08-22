/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12;

import java.util.Scanner;

/**
 *
 * @author 17932453631
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("informe a idade:");
        int idade = ler.nextInt();
        if (idade >= 18){
            System.out.println("o indivíduo é maior de idade");
        } else {
            System.out.println("o indivíduo é menor  de idade");
        }
    }
    
}
