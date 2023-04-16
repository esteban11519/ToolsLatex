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
	String output ="Figuras.txt";
	String reemplazar="nombreFigura";
	String salida;
	try{
            
            out=new PrintWriter(output);
            
            for (String figura:list) {
                salida=reader.formatoFigura.replaceAll(reemplazar, figura);
                out.println(salida);
                System.out.println(salida);
            }
            
            out.close();
             
            
        }catch(IOException e){
            System.out.println("No fue posible guardar la "
			       + "información");
        }
       
    }
         
    
}
