/**
 * Clase StackUsingLinkedList, la cual sera la que implementara las funciones del tipo de Stack
 * Autores:
 * 		Herber Sebastian Silva Muñoz 	21764
 * 		Daniel Esteban Morales Urizar 	21785
 * 		Elias Alberto Alvarado Raxon 	21808
 * Fecha de creacion: 06/03/2022
 */
package structures;

/**
 *
 * @author Sebastián
 * @param <T>
 */
public class StackUsingLinkedList<T> implements IStack<T> {
    
    private SingleLinkedList<T> listaInterna;
	
	public StackUsingLinkedList()
	{
		listaInterna = new SingleLinkedList<T>();
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
		return listaInterna.Delete(0);
	}
	
	/** 
	 * @return T
	 */
	@Override
	public T peek() {
		return listaInterna.Get(0);
	}
}