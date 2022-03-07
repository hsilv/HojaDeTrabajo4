/**
 * Clase IStack, sera la interfaz para los metodos que debe tener cada Stack
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
public interface IStack<T> {

	int count();
	
	boolean isEmpty();
	
	void push(T value);
	
	T pull();
	
	T peek();
}