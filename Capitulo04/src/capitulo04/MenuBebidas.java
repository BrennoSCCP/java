
package capitulo04;

import java.util.Scanner;

public class MenuBebidas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
    System.out.println("Menu de bebidas: ");
    System.out.println("1. Água - R$ 4.50");
    System.out.println("2. Cerveja Itaipava - R$ 10.00");
    System.out.println("3. Refrigerante 1L - R$ 3.99");
    System.out.println("4. Suco - R$ 2.00");
    System.out.println("Escolha sua opção de 1 - 4: ");
    
    int opcao = sc.nextInt();
    double preco;
    
    switch (opcao) {
        case 1:
            preco = 4.50;
            System.out.println("Água, preço: R$" + preco);
            break;
                    
         case 2:
            preco = 10.00;
            System.out.println("Cerveja Itaipava, preço: R$" + preco);
            break;
            
         case 3:
            preco = 3.99;
            System.out.println("Refrigerante, preço: R$" + preco);
         break;
         
          case 4:
            preco = 2.00;
            System.out.println("Suco, preço: R$" + preco);
            break;
            }
        }
}
