/**
 * Clase StackUsingDoubleLinkedList, la cual sera la que implementara las funciones del tipo de Stack
 * Autores:
 * 		Herber Sebastian Silva Muñoz 	21764
 * 		Daniel Esteban Morales Urizar 	21785
 * 		Elias Alberto Alvarado Raxon 	21808
 * Fecha de creacion: 06/03/2022
 */
package structures;

/**
 * @author MAAG
 * @param <T>
 *
 */
public class StackUsingDoubleLinkedList<T> implements IStack<T> {

    private DoubleLinkedList<T> listaInterna;
	
	public StackUsingDoubleLinkedList() {
		listaInterna = new DoubleLinkedList<T>();
	}
	
	/** 
	 * @return int
	 */
	@Override
	public int count() {
		return listaInterna.Count();
	}
	
	/** 
	 * @return boolean
	 */
	@Override
	public boolean isEmpty() {
		return listaInterna.IsEmpty();
	}
	
	/** 
	 * @param value
	 */
	@Override
	public void push(T value) {
		listaInterna.InsertAtStart(value);
	}
	
	/** 
	 * @return T
	 */
	@Override
	public T pull() {
		return listaInterna.DeleteAtStart();
	}
	
	/** 
	 * @return T
	 */
	@Override
	public T peek() {
		return listaInterna.Get(0);
	}	
}