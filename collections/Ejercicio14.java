package ar.edu.unlam.collections;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Ejercicio14 {

	// ¿Como haria para obtener el promedio de las claves del ejercicio anterior?

	@Test
	public void obtenerPromedio() {
		Map<Integer, Integer> mapa = new HashMap<>();
		mapa.put(1, 2);
		mapa.put(2, 4);
		mapa.put(3, 6);
		
		Integer total = 0;

		for (int i = 1; i <= mapa.size(); i++) {
			total += mapa.get(i);
		}
		Integer promedio = total / mapa.size();
		Integer expected= 4;
		
		assertEquals(expected, promedio);

	}
}
