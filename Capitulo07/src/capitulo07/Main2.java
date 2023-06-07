
package capitulo07;

import capitulo07.Animal;

public class Main2{
    
public static void main(String[] args) {
    Animal meusAnimais [] = new Animal[10];
    meusAnimais [0] = new Animal(4,30);
// adiciona um Cachorro no vetor de animais, pois Cachorro É_UM Animal
    meusAnimais [1] = new Cachorro(4,15,2);
    }
}
