package Data;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Esteban
 */
public class Reader {
  
    // Lead from a file
    Scanner reader;

    // String Array
    String datos[];

    // Array of figures
    ArrayList<Figure> figs= new ArrayList<>();
    
    public ArrayList<Figure> arrLisFigures(String fileToRead){
     
        try{
	    reader=new Scanner(new FileInputStream(fileToRead));
	    while(reader.hasNextLine())
		{
		    // You can put yours figures separates by comma
		    datos=reader.nextLine().split(",");	        
  
		    for (String dato : datos) {
			if(!dato.equals("") && dato.length()!=0)
			    {
				// With trim you delete de blank space
				figs.add(new Figure(dato.trim()));
			    }
		    }
               

		}
	    reader.close();
	}   
        catch(FileNotFoundException error){
	    
	    System.out.println("No se encontró el archivo "+fileToRead);     
	}
        return figs;
    }
    
    
    public String structureFigure(String archivoEstructuraFigura){
        String formatoFigura=""; // This is the structur of figure in latex
        try{
	    
	    reader=new Scanner(new FileInputStream(archivoEstructuraFigura));
	    while(reader.hasNextLine())
		{
		    formatoFigura+=reader.nextLine()+"\n";
		}
	    reader.close();
           
	}   
        catch(FileNotFoundException error){
	    
	    System.out.println("No se encontró el archivo "+formatoFigura);     
	}
	return formatoFigura; 
    }
     

}
