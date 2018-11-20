package ar.edu.unlam.collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Ejercicio1 {

	@Test
	public void listTest() {

		List<Integer> miLista = new ArrayList<Integer>();

		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		miLista.add(4);
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		miLista.add(4);

		// 1. miLista tiene 8 elementos
		Integer expected = 8;
		Integer actual = miLista.size();

		assertEquals(expected, actual);

		// 2. el cuarto elemento es 1
		Integer expected1 = 1;
		Integer actual1 = miLista.get(4);
		assertEquals(expected1, actual1);

		// ¿que pasa en este caso?
		miLista.add(2, 2);

		// En este caso se agrega a la lista un elemento de valor 2 en la posicion 2.

		// 3. ¿Como probarias lo que paso anterior?
		Integer expected2 = 2;
		Integer actual2 = miLista.get(2);
		assertEquals(expected2,actual2);
		// ¿que pasa en este caso?
		miLista.remove(8);
		
		//Elimina el elemento en la posicion 8
		
		// ¿que prueba se te ocurre?
		
		//Antes tenia 9 objetos en la lista, cuando sacamos el objeto en posicion 8 quedan solo 8 objetos en la lista.
		assertTrue(miLista.size()==8);
	}
}
