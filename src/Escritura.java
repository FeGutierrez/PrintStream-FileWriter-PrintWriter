
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Escritura {
    
    public static void main(String[] args) {
        PrintStream flujoSalida = null;
        try {
            File salida = new File("escritura.txt");
            flujoSalida = new PrintStream(salida);
            flujoSalida.println("Linea1");
            flujoSalida.println("XDDDDDD");
            flujoSalida.println("Linea3");
        } catch (FileNotFoundException ex) {
            System.out.println("No existe archivo");
        } finally {
            flujoSalida.close();
        }
    
    }
    //catch sout no existe archivo
    
    //finally flujoSalida.close();
}
