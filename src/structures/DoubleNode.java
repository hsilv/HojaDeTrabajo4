/**
 * Clase DoubleNode, la cual sera con la que se instanciara objetos en las otras clases
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
public class DoubleNode<T> {
    private T value;
	private DoubleNode<T> next;
	private DoubleNode<T> previous;
	
	public DoubleNode(T value) {
		this.setValue(value);
	}
	
	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}
	/**
	 * @return the next
	 */
	public DoubleNode<T> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(DoubleNode<T> next) {
		this.next = next;
	}
	/**
	 * @return the previous
	 */
	public DoubleNode<T> getPrevious() {
		return previous;
	}
	/**
	 * @param previous the previous to set
	 */
	public void setPrevious(DoubleNode<T> previous) {
		this.previous = previous;
	}
}
