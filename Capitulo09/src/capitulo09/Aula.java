
package capitulo09;

import java.util.logging.Level;
 import java.util.logging.Logger;


 public class Aula {
     
 private static  Logger log;
 public static void main(String[] args) {
 // ...
log = Logger.getLogger(Aula.class.getName());
log.log(Level.WARNING, "se fudeoi");
log.log(Level.INFO,"orario");
 // ...
 }
 } // fim de classe
