package ar.edu.unlam.collections;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class Ejercicio17 {

	// Crea un metodo que te devuelva todos los multiplos de 4 ordenados de menor a mayor

	@Test
	public void multiplosDe4Ordenados() {

		Map<Integer, Integer> mapa = new HashMap<>();

		mapa.put(1, 2);
		mapa.put(2, 4);
		mapa.put(3, 6);
		mapa.put(12, 24);
		mapa.put(6, 12);
	
		LinkedHashMap<Integer,Integer> mapaOrdenado = obtenerMultiplosDe4(mapa);
	
	}

	private LinkedHashMap<Integer,Integer> obtenerMultiplosDe4(Map<Integer, Integer> miMapa){
		
		LinkedHashMap<Integer,Integer> mapOrdenado = new LinkedHashMap<Integer,Integer>();
		
		for (Map.Entry<Integer, Integer> elemento : miMapa.entrySet()) {
		    Integer indice = elemento.getKey();
		    Integer numero = elemento.getValue();
		    if(numero%4==0) {
		    	mapOrdenado.put(indice, numero);
		    }
		}
		System.out.println(mapOrdenado);
		return mapOrdenado;
	}
}
