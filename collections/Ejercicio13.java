package ar.edu.unlam.collections;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Ejercicio13 {

	//Completa el valor de la variable indiceEsperado para que el test de verde y contesta las preguntas

	@Test
	    public void mapaTest(){


	        Map<Integer,Integer> mapa = new HashMap<>();


	        mapa.put(1,2);
	        mapa.put(2,4);
	        mapa.put(3,6);

	        Integer indiceEsperado= 3;
	        assertEquals(6, mapa.get(indiceEsperado).intValue());
	        
	    }
	/* ¿Como llamamos a los numeros 1,2 y 3?
	 ¿Son la posicion del elemento en el Mapa? 
	
	*Los numero 1,2 y 3 los llamamos indices y representan a la posicion en la que se encuentra el elemento del mapa  */

}
