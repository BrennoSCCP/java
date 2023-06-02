
package capitulo05;


public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    //metodos devem vir aqui
    
    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getNome(String nome){
        return this.nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return this.salario;
    }
    public void imprimirDados(){
        System.out.println("nome: " + nome);
        System.out.println("cpf: " + cpf);
        System.out.println("salario: " + salario);
    }
    
}
