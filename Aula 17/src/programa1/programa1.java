/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa1;

import java.util.Scanner;

/**
 *
 * @author 17932453631
 */
public class programa1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
       int n;
       
       System.out.println("Digite um valor inteiro");
       n = ler.nextInt();
       
       for(int i = 2; i < n; i+=2){
        System.out.println(i);
    }
}
}