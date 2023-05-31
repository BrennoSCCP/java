package Capitulo03.desafio3triangulo;


public class Triangulo {
    //propriedades retangulo
    private double base;
    private double lado1;
    private double lado2;
    private double altura;
    
    
    //consttrutor classe
    public Triangulo(double base, double altura, double lado1, double lado2) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
        
    }
    
    //metodo calcular area do triangulo
    public double calcularArea() {
        return (this.base * this.altura)/2;
    }
    
    //metodo calcular perimetro do triangulo
    public double calcularPerimetro() {
        return (this.base + this.lado1 + this.lado2);
    }
}