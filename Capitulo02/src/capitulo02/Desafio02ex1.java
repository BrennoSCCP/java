
package capitulo02;

import java.util.Scanner;


public class Desafio02ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("digite 2 numeros inteiros: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        int soma = num1 + num2;
        
        System.out.println("a soma dos numeros é: "+soma);
    }
}
