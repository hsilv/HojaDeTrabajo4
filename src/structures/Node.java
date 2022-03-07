/**
 * Clase Node, la cual sera con la que se instanciara objetos en las otras clases
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
public class Node<T> {
	private T value;
	private Node<T> next;
	
	public Node(T value) {
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
	public Node<T> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	
}