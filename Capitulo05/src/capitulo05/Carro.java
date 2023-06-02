
package capitulo05;


public class Carro {
    public String modelo;
    protected int ano;
    private String fabricante;
    
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    
    public String getFabricante(){
        return this.fabricante;
    }
}
