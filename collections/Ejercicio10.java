package ar.edu.unlam.collections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Ejercicio10 {

	// Implementa el metodo eliminar repetidos y prueba que funciona correctamente

	public class ListTest {

		@Test
		public void listTest() {

			List<Integer> miLista = new LinkedList<>();

			miLista.add(1);
			miLista.add(2);
			miLista.add(3);
			miLista.add(4);
			miLista.add(1);
			miLista.add(2);
			miLista.add(3);
			miLista.add(4);

			Set sinRepetidos = eliminaRepetidos(miLista);

		}

		private Set<Integer> eliminaRepetidos(List<Integer> miLista) {
			Set<Integer> listaSinRepetidos = new HashSet<Integer>();
			for (Integer elemento : miLista) {
				listaSinRepetidos.add(elemento);
			}
			return listaSinRepetidos;
		}
	}
}
