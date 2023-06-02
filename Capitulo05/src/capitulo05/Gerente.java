
package capitulo05;


public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }
    
    public boolean autentica(int senha){
        if (this.senha == senha){
            System.out.println("Acesso permitido!");
            return true;
        }else{
            System.out.println("acesso negado!");
            return false;
        }
    }
    //outros métodos
    public int getSenha(){
        return senha;
        
    }
    
    public void setSenha(int senha){
        this.senha = senha;
        
    }
    
    public int getNumeroDeFuncionariosGerenciados(){
        return numeroDeFuncionariosGerenciados;
        
    }
    
    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados){
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
}
