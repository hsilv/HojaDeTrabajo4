/**
 * Clase StackUsingArrayList, la cual sera la que implementara las funciones del tipo de Stack
 * Autores:
 * 		Herber Sebastian Silva Muñoz 	21764
 * 		Daniel Esteban Morales Urizar 	21785
 * 		Elias Alberto Alvarado Raxon 	21808
 * Fecha de creacion: 06/03/2022
 */
package structures;

import java.util.ArrayList;

/**
 * @author MAAG
 * @param <T>
 *
 */
public class StackUsingArrayList<T> implements IStack<T> {

	private ArrayList<T> miListaInterna;
	
	public StackUsingArrayList() {
		miListaInterna = new ArrayList<T>(); 
	}
	
	/** 
	 * @return int
	 */
	@Override
	public int count() {
		return miListaInterna.size();
	}
	
	/** 
	 * @return boolean
	 */
	@Override
	public boolean isEmpty() {
		return miListaInterna.isEmpty();
	}
	
	/** 
	 * @param value
	 */
	@Override
	public void push(T value) {
		miListaInterna.add(0, value);
	}
	
	/** 
	 * @return T
	 */
	@Override
	public T pull() {
		return miListaInterna.remove(0);
	}
	
	/** 
	 * @return T
	 */
	@Override
	public T peek() {		
		return miListaInterna.get(0);
	}
}