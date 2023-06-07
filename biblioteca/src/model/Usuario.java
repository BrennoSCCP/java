
package model;

import java.util.ArrayList;
import java.util.List;


public class Usuario {
    
    private  int  id; 
    private  String  nome; 
    private  String  email; 
    private  int  telefone; 
    private  int  qtdLivrosEmprestados; 
    private  List<Livro>  livrosEmprestados  =  new  ArrayList<>(); 
    
    
 public  Usuario( String  nome,  String  email,  int  telefone)  { 
    this .nome  =  nome; 
    this .email  =  email; 
    this .telefone  =  telefone; 
    this .qtdLivrosEmprestados  =  0 ; 
} 
// getters e setters vocês já sabem fazer :) 
 public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getQtdLivrosEmprestados() {
        return qtdLivrosEmprestados;
    }

    public void setQtdLivrosEmprestados(int qtdLivrosEmprestados) {
        this.qtdLivrosEmprestados = qtdLivrosEmprestados;
    }
    
    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}