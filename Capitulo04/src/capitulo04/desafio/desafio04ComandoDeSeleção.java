
package capitulo04.desafio;

import java.util.Scanner;

public class desafio04ComandoDeSeleção {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua nota de 0 a 100: ");
        int nota = sc.nextInt();
        String condição;
        
        if (nota>=90) {
            condição = "Ótimo";
            
        }
        
        else if (nota>=80) {
            condição = "Bom";
        }
        
        else if (nota>=70) {
            condição = "Médio";
        }
        
        else if (nota>=60) {
            condição = "Abaixo";
        }
        
        else {
            condição = "Péssimo";
        }
        System.out.println("Condiçãi: " + condição);
        
    }
}
