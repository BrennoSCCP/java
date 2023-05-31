
package Capitulo03.geometria;


public class Retangulo {
    //propriedades retangulo
    private double base;
    private double altura;
    
    //consttrutor classe
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //metodo calcular area do retangulo
    public double calcularArea() {
        return this.base * this.altura;
    }
    
    //metodo calcular perimetro do retangulo
    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
}

