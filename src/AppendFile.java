
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;
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
public class AppendFile {
    
    public static void main(String[] args) throws IOException{
        File salida = new File("filewriter.txt");
        FileWriter fw = new FileWriter(salida, true);
        PrintWriter flujoSalida = new PrintWriter(fw);
        try {
            if (!salida.exists()) {
                salida.createNewFile();
            }
            Scanner sc = new Scanner(System.in);
            flujoSalida.println(sc.nextLine());
            flujoSalida.println("Prueba");
            flujoSalida.println("Linea3");
        } catch (FileNotFoundException ex) {
            System.out.println("No existe archivo");
        } finally {
            flujoSalida.close();
        }
        
//            PrintWriter flujoSalida = null;
//            FileWriter fw = null;
//            //File salida
//            //FileWriter fw
//            //PrintWriter new PrintW(fw)
//        try {
//       
//            
//            File salida = new File("filewriter.txt");
//            
//            if (!salida.exists()) {
//                salida.createNewFile();
//            }
//            fw = new FileWriter(salida,true);
//            flujoSalida = new PrintWriter(fw);
//            flujoSalida.println("Linea1");
//            flujoSalida.println("XDDDDDD");
//            flujoSalida.println("Linea3");
//        } catch (FileNotFoundException ex) {
//            System.out.println("Archivo no existe");
//        } finally {
//            flujoSalida.close();
//        }


    }
}
