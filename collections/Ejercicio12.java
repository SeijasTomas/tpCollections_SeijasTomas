package ar.edu.unlam.collections;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Ejercicio12 {

	/*Queremos borrar la linea Collections.sort(miLista) del test del Ejercicio 7 y que el mismo siga dando verde. �Que cambios tenes que hacer?

	*Para que el test siga dando verde debemos modificar el orden en que se agregan los elementos a la lista*/
	
	 @Test
	 public void ordenarRectangulosDeMenorAMyorPorPerimetro(){

	        List<Rectangulo>  miLista = new LinkedList<>();

	        miLista.add(new Rectangulo(3d,2d));
	        miLista.add(new Rectangulo(4d,5d));
	        miLista.add(new Rectangulo(4d,6d));
	        
	        Double expected1 = 10.0;
	        Double expected2 = 18.0;
	        Double expected3 = 20.0;
	        
	        Double actual1=  miLista.get(0).calcularPerimetro();
	        Double actual2=  miLista.get(1).calcularPerimetro();
	        Double actual3= miLista.get(2).calcularPerimetro();
	        
	        assertEquals(expected1, actual1);
	        assertEquals(expected2, actual2);
	        assertEquals(expected3, actual3);

	    }

}
