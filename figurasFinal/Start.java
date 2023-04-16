import Data.Reader;
import Data.Writer;
import Data.Figure;

import java.util.ArrayList;

/**
 * @author Esteban
 */

public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// path to figure names
	String fileToRead="figureNames.txt";

	// path to figure structure
	String fileFormatFigure="figureStructure.txt";

	// outputs in latex format
	String output="figures.txt";

	// Aux string to figure format
	String formatFigure="";
	
        Reader read=new Reader();
        Writer write=new Writer();
        
        ArrayList<Figure> arrFigure=read.arrLisFigures(fileToRead);

	// for(Figure figure: arrFigure){
	//     System.out.println(figure.getName());
	//     System.out.println(figure.getExtension());
	//     System.out.println();
	    
	// }
	
	formatFigure=read.structureFigure(fileFormatFigure);

	// System.out.println(formatFigure);
	
        write.outTable(arrFigure,formatFigure,output);
        
   
        

    }

}
