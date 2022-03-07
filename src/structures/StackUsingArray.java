/**
 * Clase StackUsingArray, la cual sera la que implementara las funciones del tipo de Stack
 * Autores:
 * 		Herber Sebastian Silva Muñoz 	21764
 * 		Daniel Esteban Morales Urizar 	21785
 * 		Elias Alberto Alvarado Raxon 	21808
 * Fecha de creacion: 06/03/2022
 */
package structures;


public class StackUsingArray<T> implements IStack<T>
{
    private T miListaInterna[];

    public StackUsingArray(int largo)
    {
        miListaInterna = (T[]) new Object[largo];
    }
    
    /** 
     * @return int
     */
    @Override
    public int count() {
        int contador = 0;
        for(int x = 0; x < miListaInterna.length; x++)
        {
            if(miListaInterna[x] != null) contador++;
        }
        return contador;
    }
    
    /** 
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
		if(miListaInterna == null) {
			return true;
		}
		else return false;
    }
    
    /** 
     * @param value
     */
    @Override
    public void push(T value) {
        if(!isEmpty())
        {
            if(count() - 1 == miListaInterna.length - 1) extender();
            System.arraycopy(this.miListaInterna, 0, this.miListaInterna, 1, miListaInterna.length - 1);
        }
        this.miListaInterna[0] = value;
    }
    
    /** 
     * @return T
     */
    @Override
    public T pull() {
        T temp = this.miListaInterna[0];
        if(count() == miListaInterna.length - 1) extender();
        System.arraycopy(miListaInterna, 1, miListaInterna, 0, miListaInterna.length - 1);
        return temp;
    }

    /** 
     * @return T
     */
    @Override
    public T peek() {
        return miListaInterna[0];
    }

    private void extender()
    {
        T temp[] = (T[]) new Object[miListaInterna.length + 5];   
        System.arraycopy(miListaInterna, 0, temp, 0, miListaInterna.length);
        this.miListaInterna = temp;

    }
}
