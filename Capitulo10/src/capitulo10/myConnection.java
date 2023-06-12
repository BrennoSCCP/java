/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo10;

import java.sql.*;
 public class myConnection {
     
     public static void main(String[] args) {
         try {
             
             
     Class.forName("org.postgresql.Driver"); // registra o driver
     Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
 "postgres", "123456");
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM escola"); // executa comando SQL
    
    
 while (rs.next()) { //manipula resultado
     
 int id = rs.getInt("idescola");
 
 String nome = rs.getString("nomeescola");
 System.out.println(id + ", "+ nome );
 }
 conn.close(); // fecha conexão
 
 } 
 
 catch (Exception e) {
 System.err.println("Erro: "+ e.getMessage());
            } 
        } 
    }
