/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 *
 * @author Esteban
 */
public class writer {
    
   public void outTable(ArrayList<String> list)
   {
      PrintWriter out;
      String output ="table.txt";
      String etiqFinal=" "; /*" \\hline"*/;
      String tabular="";
      String encabezadoFinal;
      boolean primeraLinea=true;
   
       try{
            
            out=new PrintWriter(output);
            
            for (int i = 0; i < reader.numCol; i++) {
               tabular+="l";
           }
           encabezadoFinal=reader.encabezado.replaceFirst("begintabular",("\\\\begin{tabular}"+"{@{}"+tabular+"@{}}")).trim();
            System.out.print(encabezadoFinal);
            out.print(encabezadoFinal);
            
            for (int i = 0; i < list.size(); i++) {
            
               
                if((i+1)%reader.numCol==1)
                {
                    if(i!=0)
                    {
                        
                        System.out.print("\\");
                      out.print("\\");
                        System.out.print("\\");
                      out.print("\\"); 
                       System.out.print(etiqFinal);
                      out.print(etiqFinal);
                      
                      // Se encarga de poner \toprule en la primera linea
                      if(primeraLinea){
                        System.out.print("\\toprule");
                        out.print("\\toprule");
                      }
                      
                      primeraLinea=false;
                    }
                    System.out.println();
                    out.print("\n");
                    
                }
                
                if((i+1)%reader.numCol==0)
                {
                    System.out.print(String.format("  %s  ", list.get(i)));
                    out.print(String.format("  %s  ", list.get(i)));
                }else
                {
                    System.out.print(String.format("  %s  &", list.get(i)));
                    out.print(String.format("  %s  &", list.get(i)));
                }
                
                
                    
           }
            System.out.print("\\");
            out.print("\\");
            System.out.print("\\");
            out.print("\\");

            System.out.print(etiqFinal);
            out.print(etiqFinal);
            
            System.out.print("\n"+reader.pie);
            out.print("\n"+reader.pie);
            

        out.close();
             
            
        }catch(IOException e){
            System.out.println("No fue posible guardar la "
                    + "información");
        }
       
   }
         
    
}
