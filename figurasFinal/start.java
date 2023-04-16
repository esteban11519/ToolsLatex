import Data.reader;
import Data.writer;
import java.util.ArrayList;

/**
 * @author Esteban
 */

public class star {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        reader leer=new reader();
        writer escribir=new writer();
        
        ArrayList<String> auxLeer=leer.numbers();
        leer.estruturaFigura();
        escribir.outTable(auxLeer);
        
        System.out.println();
        System.out.println();
        

    }

}
