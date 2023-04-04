
import Data.reader;
import Data.writer;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
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
