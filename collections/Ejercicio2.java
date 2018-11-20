package ar.edu.unlam.collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Ejercicio2 {
		//Modifica la siguiente porcion de codigo para que compile. Explica que tuviste que agregar para que compile.
	
	@Test
    public void borrarUnaPosicionNoExistente(){

        List<Integer>  miLista = new ArrayList<Integer>();

        miLista.add(1);

        miLista.remove(0);  //Tuve que agregar una posicion al metodo "remove" y luego agregarle el ";" al final.
    }
    
    @Test
    public void agregarUnElementoEnUnaPosicion(){

        List<Integer>  miLista = new ArrayList<Integer>();

        miLista.add(1);
        miLista.add(2);

        miLista.add(2,3); //Tuve que cambiar la posicion 3 a 2 ya que no se puede saltear posiciones.
    }
}
