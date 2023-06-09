/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo09;

// Java program to demonstrate
 // Logger.info(String msg) method
 import java.util.logging.Logger;
 public class LOGGER1 {
 public static void main(String[] args)
 {
 // Create a Logger
 Logger logger
 = Logger.getLogger(
 LOGGER1.class.getName());
 // Call info method
 logger.info("This is message 1");
 logger.info("This is message 2");
 logger.info("This is message 3");
 logger.info("This is message 4");
 }
 }

