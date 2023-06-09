/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo09;

// Java program to demonstrate
 // Logger.info(Supplier) method
 import java.util.logging.Logger;
 import java.util.function.Supplier;
 public class LOGGER3 {
 public static void main(String[] args)
 {
 // Create a Logger
 Logger logger
 = Logger.getLogger(
 LOGGER3.class.getName());
 // Create a supplier<String> method
 Supplier<String> StrSupplier
 =() -> new String("Logger logs");
 // Call info(Supplier<String>)
 logger.info(StrSupplier);
 }
 }
