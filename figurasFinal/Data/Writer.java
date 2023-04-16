package Data;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 *
 * @author Esteban
 */
public class Writer {
    
    public void outTable(ArrayList<Figure> list, String formatFigure,  String output){
	// In the figureStructure will be replace stringToReplaceName by name 
	String stringToReplaceName="figureName";

	// In the figureStructure will be replace stringToReplaceExtension by extension
	String stringToReplaceExtension="figureExtension";
	
	PrintWriter out;	// Write in filex
	String salida;		// Aux string
     
	try{
            
            out=new PrintWriter(output);
            
            for (Figure figure : list) {
		// Replace respective items
		salida=formatFigure.replaceAll(stringToReplaceName, figure.getName());
		salida=salida.replaceAll(stringToReplaceExtension, figure.getExtension());
		// write in file
		out.println(salida);

		// Output in console
                System.out.println(salida);
            }
            
            out.close();
                        
        }catch(IOException e){
            System.out.println("No fue posible guardar la en "+output);
        }
	return;
    }
         
    
}
