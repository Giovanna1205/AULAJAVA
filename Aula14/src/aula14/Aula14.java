/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14;

import java.util.Scanner;

/**
 *
 * @author 17932453631
 */
public class Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int menu;
       do{
           System.out.println("CARDÁPIO");
            System.out.println("1.HAMBÚRGUER- 30,00"); 
               System.out.println("2.CHEESEBURGUER- 35,50");
            System.out.println("3.FRITAS- 20,50");
            System.out.println("4.REFRIGERANTE- 10,00");
            System.out.println("5.MILKSHAKE- 30,00");
            System.out.println("0.SAIR DO CARDÁPIO");
            System.out.println("ESCOLHA UMA OPÇÃO.");
                menu = ler.nextInt();
                switch (menu){
                    case 1:
                        System.out.println("HAMBÚRGUER: R$30,00");
                        break;
                    case 2:
                        System.out.println("CHEESEBURGUER: R$35,50");
                        break;
                    case 3:
                        System.out.println("FRITAS: R$20,50");
                        break;
                    case 4:
                        System.out.println("REFRIGERANTE: R$10,00");
                        break;
                    case 5:
                        System.out.println("MILKSHAKE: R$30,00");
                        break;
                    default:
                        System.out.println("OPÇÃO INVÁLIDA");
                        break;
                }
                  System.out.println("");
                        
                        
                }while (menu != 0);
       }
    }


