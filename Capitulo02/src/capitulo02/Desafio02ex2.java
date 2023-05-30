package capitulo02;

import java.util.Scanner;


public class Desafio02ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("digite uma distancia em km e em seguida o tempo em horas: ");
        int distancia = input.nextInt();
        int tempo = input.nextInt();
        
        float VelocidadeMedia = (distancia/tempo);
        
        System.out.println ("a velocidade media é: "+VelocidadeMedia+ "km");
    }
}