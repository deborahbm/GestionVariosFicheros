
package uf1_ejer7_dbm;


import java.io.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UF1_Ejer7_DBM {

    
    public static void main(String[] args){
        
        try {
            System.out.println("Creación fichero 1.");
            File fichero1 = new File("Fichero1.txt");
            BufferedWriter f1 =new BufferedWriter ( new FileWriter (fichero1));
             System.out.println("Creación fichero 2.");
            File fichero2 = new File("Fichero2.txt");  
            BufferedWriter f2 =new BufferedWriter (new FileWriter (fichero2));
            
            System.out.println("Se va a proceder a escribir en fichero 1:");
            f1.write("********** Contenido Fichero1 **********");
            System.out.println("Se va a proceder a escribir en fichero 2:");
            f2.write("Y contenido Fichero2");
     
            f1.close();
            f2.close();
            System.out.println("Se han cerrado ambos ficheros");
       
            //Se abre flujo de lectura ficheros 1 y 2
            File fichLeer1 = new File("Fichero1.txt");
            BufferedReader fLeer1=new BufferedReader (new FileReader (fichLeer1));
            
            File fichLeer2 = new File("Fichero2.txt");
            BufferedReader fLeer2=new BufferedReader (new FileReader (fichLeer2));
            
            //Se abre flujo de escritura fichero 3
            File fichero3 = new File("Fichero3.txt");  
            BufferedWriter f3 =new BufferedWriter (new FileWriter (fichero3));
        
           //Lectura de líneas de los ficheros 1 y 2 y escritura en fichero3
            String lineaF1;
            String lineaF2;
            if((lineaF1=fLeer1.readLine()) != null){                
                f3.newLine();
                f3.write(lineaF1);
                
                fLeer1.close();
            }
            if ((lineaF2=fLeer2.readLine()) != null){
                f3.newLine();
                f3.newLine();
                f3.write(lineaF2);
                
                fLeer2.close();
                f3.close();
            }
            System.out.println("Se ha creado el ´Fichero3.txt´con el contenido de los ficheros 1 y 2.");
            f3.close();
        } catch (IOException ex) {
            Logger.getLogger(UF1_Ejer7_DBM.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }	
    
}
