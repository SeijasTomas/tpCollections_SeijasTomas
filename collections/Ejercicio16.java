package ar.edu.unlam.collections;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Ejercicio16 {

	// Explica la diferencia entre los dos assertNull del siguiente test

	@Test
	public void nullElements() {

		Map<Integer, Integer> mapa = new HashMap<>();

		mapa.put(1, null);

		assertNull(mapa.get(1));
		assertNull(mapa.get(2));

		//El primer assertNull da en verde ya que en el indice uno del map ingresamos el valor "null".
		//El segundo assertNull da en verde ya que al no ingresar ningun dato en el indice dos del map, el valor es "null" por defecto.
		
	}
}