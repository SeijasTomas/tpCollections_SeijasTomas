package ar.edu.unlam.collections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class Ejercicio9 {

	// El siguiente test no compila, falta declarar la variable unaColeccion.
	// Declara la variable y cambia el valor del variable tamanioEsperado para que el test de verde

	@Test
	public void listTest() {

		Set<Integer> unaColeccion = new HashSet<>();

		unaColeccion.add(1);
		unaColeccion.add(1);

		assertEquals(1, unaColeccion.size());

		unaColeccion.add(2);
		unaColeccion.add(3);

		
		Integer tamanioEsperado = 3;
		Integer tamanio = unaColeccion.size();
		assertEquals(tamanioEsperado, tamanio);

	}
}
