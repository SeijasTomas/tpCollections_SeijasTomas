package ar.edu.unlam.collections;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Ejercicio15 {

	//Utilizando el ejercicio 13 implementa el metodo crearNuevoMapa para que el siguiente test de verde
	
	@Test
	public void mapearElementosTest() {

		Map<Integer, Integer> mapa = new HashMap<>();

		mapa.put(1, 2);
		mapa.put(2, 4);
		mapa.put(3, 6);

		Map<Integer, String> otroMapa = crearNuevoMapa(mapa);

		assertEquals(otroMapa.get(1), "El doble de 1 es 2");
		assertEquals(otroMapa.get(2), "El doble de 2 es 4");
		assertEquals(otroMapa.get(3), "El doble de 3 es 6");

	}

	private Map<Integer, String> crearNuevoMapa(Map<Integer, Integer> mapa) {
		Map<Integer, String> nuevoMapa = new HashMap<>();
		for (int i = 1; i <= mapa.size(); i++) {
			nuevoMapa.put(i, "El doble de " + i + " es " + mapa.get(i).toString());
		}
		return nuevoMapa;

	}
}
