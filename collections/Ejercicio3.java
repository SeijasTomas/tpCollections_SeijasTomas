package ar.edu.unlam.collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Ejercicio3 {

	//Completa los siguientes siguiente test
	
	@Test
    public void ejemplosLista(){

        List<Integer>  miLista = new ArrayList<Integer>();

        miLista.add(8);
        miLista.add(4);
        miLista.add(7);
        miLista.add(10);
        miLista.add(12);
        miLista.add(90);
        miLista.add(24);
        miLista.add(84);
        miLista.add(18);

        assertEquals(28.56, calcularPromedio(miLista), 0.01);
        assertEquals(90, buscarElMayor(miLista).intValue());

    }

    private Double calcularPromedio(List<Integer> miLista) {
        Double promedio = 0.0;
        Integer total= 0;
       
        for (int i = 0; i < miLista.size(); i++) {
		total+= miLista.get(i);
	}
       promedio = (double) total/ (double) miLista.size();
        return promedio;
    }
    
    private Integer buscarElMayor(List<Integer> miLista) {
    	Integer mayor= -9999;
    	
    	for (int i = 0; i < miLista.size(); i++) {
			if(miLista.get(i)>mayor) {
				mayor = miLista.get(i);
			}
		}
    	
        return mayor;
    }
    
}
