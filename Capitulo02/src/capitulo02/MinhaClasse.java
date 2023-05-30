
 
package capitulo02;


public class MinhaClasse {
    //variaveis de instancia
    private int valor1;
    private int valor2;
    
    //construtor
    public MinhaClasse(int v1, int v2) {
        this.valor2 = v1;
        this.valor2 = v2;
        
    }
    
    
    //metodos
    public int somar () {
        return this.valor1 + this.valor2;
    }
    
    public int subtrair() {
        return this.valor1 - this.valor2;
    }
}