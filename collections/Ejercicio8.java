package ar.edu.unlam.collections;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Ejercicio8 {

	@Test
	 public void ordenarRectangulosDeMenorAMyorPorSuperfice(){

	        List<Rectangulo>  miLista = new LinkedList<>();

	        miLista.add(new Rectangulo(4d,6d));
	        miLista.add(new Rectangulo(3d,2d));
	        miLista.add(new Rectangulo(4d,5d));


	        Collections.sort(miLista, new Comparator<Rectangulo>() {
	            @Override
	            public int compare(Rectangulo o1, Rectangulo o2) {
	                return o1.calcularArea().compareTo(o2.calcularArea());
	            }
	        });

	        
	        Double superficie1 = 6d; 
	        Double superficie2 = 20d;
	        Double superficie3 = 24d;
	        
	        Double actual1=  miLista.get(0).calcularArea();
	        Double actual2=  miLista.get(1).calcularArea();
	        Double actual3= miLista.get(2).calcularArea();
	       
	        assertEquals(superficie1, actual1);
	        assertEquals(superficie2, actual2);
	        assertEquals(superficie3, actual3);

	    }

}
