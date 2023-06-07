
package capitulo07;


public class Cachorro extends Animal{
    int corPelo;

    
    public Cachorro(int p, int a){
        //pata e altura sao definidos em Animal e gerdados aqui
       super(p,a)   ;      
    }
    public Cachorro(int p, int a, int corPelo)
    {
        //super usa o construtor da superclasse Animal
        super(p,a);
        this.corPelo = corPelo;
    }
}
   