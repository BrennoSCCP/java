
package capitulo04;

import javax.swing.JOptionPane;
        
public class CadastroAlunos {
    public static void main (String[] args) {
        //criando array pra armazedar dados de alunos
        String[][] alunos = new String[50][3];
        //variavel para controlar a quantidade de alunos cadastrados
        int qtdAlunos = 0;
        
        //laço para permitir que o ususario cadastre variosalunos
        
        while (true) {
            //recebendo dados do ususario com JOptionPane
            String nome = JOptionPane.showInputDialog(null,
         "Digite o nome do aluno: ");
            int idade =
         Integer.parseInt(JOptionPane.showInputDialog(null,
         "Digite a idade do aluno: "));
            double nota =
          Double.parseDouble(JOptionPane.showInputDialog(null,
         "Digite a nota do aluno: "));
            
            //armazenando os dados do aluno no array
            alunos[qtdAlunos][0] = nome;
            alunos[qtdAlunos][1] = Integer.toString(idade);
            alunos[qtdAlunos][2] = Double.toString(nota);
            qtdAlunos++;
            
            //verificando se o usuario deseja cadastrar outro aluno
            
            int opcao = JOptionPane.showConfirmDialog(null,
                    "Deseja cadastrar outro aluno?");
            if (opcao != JOptionPane.YES_OPTION){
                break;
            }
        }
        
        //exibindo os dados dos alunos cadastrados
        String listaAlunos = "Lista de alunos:\n";
        double totalNotas = 0.0;
        for (int i = 0; i < qtdAlunos; i++) {
            listaAlunos += alunos[i][0] + " - " + alunos [i][1]
                    +"anos - Nota: " +alunos[i][2] + "\n";
            totalNotas += Double.parseDouble(alunos[i][2]);
        }
        
        double mediaNotas = totalNotas / qtdAlunos;
        listaAlunos += "\nMédia das notas: " + mediaNotas;
        JOptionPane.showMessageDialog(null, listaAlunos);
    }    
}
