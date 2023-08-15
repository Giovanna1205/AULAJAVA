
package aula07;

import java.util.Scanner;

/**
 * 
 * 
 * @author giovanna
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("Informe o nome do aluno:");
        String nome=ler.next();
        System.out.println("Informe a primeira nota:");
        float n1= ler.nextFloat();
        System.out.println("Informe a segunda nota:");
        float n2=ler.nextFloat();
        System.out.println("Informe a terceira nota:");
        float n3=ler.nextFloat();
        System.out.println("Informe a quarta nota:");
        float n4=ler.nextFloat();
        float soma= n1+n2+n3+n4;
        float media= soma/4;
        System.out.println("A média entre as notas informadas será:"+media);
                
    }
    
}
