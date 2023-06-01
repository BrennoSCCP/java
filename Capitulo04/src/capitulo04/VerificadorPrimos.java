
package capitulo04;

import java.util.Scanner;

public class VerificadorPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num = sc.nextInt();
        boolean ehPrimo = true;
            if (num < 2) {
                ehPrimo = false;
              
            } else {
                for (int i = 2; i< num; i++) {
                    if (num % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }
            if (ehPrimo) {
                System.out.println(num + " é primo.");
                
            } else {
                System.out.println(num + " não é primo.");
            }
            sc.close();
    }
}
