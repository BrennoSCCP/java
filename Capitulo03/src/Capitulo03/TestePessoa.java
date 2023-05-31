
package Capitulo03;


public class TestePessoa {
    
        public static void main(String[] args) {
            //instanciacao da classe pessoa
            Pessoa p1 = new Pessoa();
            
            //atribuicao
            p1.setNome("Brenno");
            p1.setIdade(19);
            
            //exibir valores
            System.out.println("Nome: " + p1.getNome());
            System.out.println("Idade: " + p1.getIdade());
        }
        
    }
