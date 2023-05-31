package Capitulo03.desafio3calculotriangulo;



import Capitulo03.desafio3triangulo.Triangulo;

public class CalculoTri {
    
    public static void main(String[] args) {
        
      
        Triangulo triangulo = new Triangulo(4, 8, 4, 6);
                
                
        double area = triangulo.calcularArea();
        double perimetro = triangulo.calcularPerimetro();
        
        System.out.println("Área do triangulo: " + area);
        System.out.println("Perimetro do triangulo: " + perimetro);
    }
    
}