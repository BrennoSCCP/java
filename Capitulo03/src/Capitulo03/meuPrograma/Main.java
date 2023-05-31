
package Capitulo03.meuPrograma;

import Capitulo03.geometria.Retangulo;


public class Main {
    
    //etodo principal
    public static void main(String[] args) {
        
        //criando objeto da classe retangulo com base 5 e altura 10
        Retangulo retangulo = new Retangulo(5, 5);
        
        //calculando area e perimetro do retangulo
        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();
        
        //imprimindo resultado
        System.out.println("Area do retangulo: " + area);
        System.out.println("perimetro do retangulo: " + perimetro);
    }
}
