
package capitulo06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class TesteArrayList {
    public static void main(String[] args){
    ArrayList<Integer> numeros = new ArrayList<Integer>();
numeros.add(10);
numeros.add(20);
numeros.add(30);
for (Integer numero : numeros){
    System.out.println(numero);
    
}

HashSet<String> nomes = new HashSet<String>();
nomes.add("alice");
nomes.add("bob");
nomes.add("charlie");
for (String nome : nomes){
    System.out.println(nome);
    
}

HashMap<String, Integer> idades = new HashMap<String, Integer>();
idades.put("alice",25);
idades.put("bob",30);
idades.put("charlie",35);
for (String nome : idades.keySet()){
    Integer idade = idades.get(nome);
    System.out.println(nome + " tem " + idade + " anos");
}
       
 LinkedList<String> lista = new LinkedList<String>();
 lista.add("primeiro");
 lista.add("segundo");
 lista.add("terceiro");
 for (String elemento : lista){
     System.out.println(elemento);
 }
}
}
