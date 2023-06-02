
package capitulo05;


public class TesteCarro {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.modelo = "sedan";
        carro.ano = 2021;//acessivel, pois TesteCarro e Carro tao no mesmo pacote
    
    //carro.fabricante = "ford!;//erro de compilação, fabricante é privado
    
    CarroEsportivo esportivo = new CarroEsportivo();
    esportivo.modelo = "Esportivo";
    esportivo.ano = 2023;
    //esportivo.fabricante = "Ferrari";//erro de compilaçãp, fabricante é privado
    
    }
    
}
