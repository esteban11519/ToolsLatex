package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Esteban
 */
public class reader {
    String input= "nombreFiguras.txt";
    String archivoEstructuraFigura= "estructuraFigura.txt";

    
    Scanner reader;
    String datos[];
    ArrayList<String> figs= new ArrayList();
    
    static String formatoFigura;
    
    public ArrayList numbers(){
     
        try
	    {
		reader=new Scanner(new FileInputStream(input));
		while(reader.hasNextLine())
		    {

			datos=reader.nextLine().split(",");	        
  
			for (String dato : datos) {
			    if(!dato.equals(""))
				{
				    figs.add(dato.trim());
				}
			}
               

		    }
		reader.close();
	    }   
        catch(FileNotFoundException error)
	    {
		System.out.println("Àrchivo no encontrado");     
	    }
        return figs;
    }
    
    
    public void estruturaFigura(){
        formatoFigura="";
        try
	    {
		reader=new Scanner(new FileInputStream(archivoEstructuraFigura));
		while(reader.hasNextLine())
		    {

			formatoFigura+=reader.nextLine()+"\n";
                

		    }
		reader.close();
           
	    }   
        catch(FileNotFoundException error)
	    {
		System.out.println("Àrchivo no encontrado");     
	    }
    }
     
    
}
