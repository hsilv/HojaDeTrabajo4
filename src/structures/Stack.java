/**
 * Clase Stack, se encargara de determinar el tipo de Stack que se usara en la clase de simCalculadora
 * Autores:
 * 		Herber Sebastian Silva Muñoz 	21764
 * 		Daniel Esteban Morales Urizar 	21785
 * 		Elias Alberto Alvarado Raxon 	21808
 * Fecha de creacion: 06/03/2022
 */
package structures;

public class Stack<T> {
    public static IStack<Integer> construir(int tipo){
        switch (tipo) {
            case 1:
                return new StackUsingArrayList<>();                
            case 2:
                return new StackUsingArrayList<>(); 
            case 3:
                return new StackUsingLinkedList<>(); 
            case 4:
                return new StackUsingDoubleLinkedList<>(); 
            default:
                System.out.println("Opción no válida");
                return null;
                
        }
    }
}
