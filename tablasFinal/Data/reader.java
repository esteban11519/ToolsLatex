/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class reader {
    String input= "lisNum.txt";
    String archivoEncabezado="encabezado.txt";
    String archivoPie="pie.txt";
    
    static int numCol;
    static String encabezado;
    static String pie;
    
    Scanner reader;
    String datos[];
    ArrayList<String> num= new ArrayList();
    boolean contador=false;
    
    public ArrayList numbers(){
     
        try
        {
           reader=new Scanner(new FileInputStream(input));
           while(reader.hasNextLine())
           {

                datos=reader.nextLine().split("\t");
                
                
                
               for (String dato : datos) {
                 if(!dato.equals(""))
                 {
                     num.add(dato.trim());
                 }
               }
               if(!contador) numCol=num.size();
               contador=true;

           }
           reader.close();
        }   
        catch(FileNotFoundException error)
        {
            System.out.println("Àrchivo no encontrado");     
        }
        return num;
    }
    
    public void estruturaTabla(){
        encabezado="";
        pie="";
        try
        {
           reader=new Scanner(new FileInputStream(archivoEncabezado));
           while(reader.hasNextLine())
           {

                encabezado=encabezado+reader.nextLine()+"\n";
                

           }
           reader.close();
           
           reader=new Scanner(new FileInputStream(archivoPie));
           while(reader.hasNextLine())
           {

                pie=pie+reader.nextLine()+"\n";
                

           }
           reader.close();
        }   
        catch(FileNotFoundException error)
        {
            System.out.println("Àrchivo no encontrado");     
        }
    }
        
    
    
}
