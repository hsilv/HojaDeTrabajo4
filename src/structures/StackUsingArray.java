package structures;

import java.util.Arrays;

public class StackUsingArray<T> implements IStack<T>
{
    private T miListaInterna[];

    public StackUsingArray(int largo)
    {
        miListaInterna = (T[]) new Object[largo];
    }

    @Override
    public int count() {
        int contador = 0;
        for(int x = 0; x < miListaInterna.length; x++)
        {
            if(miListaInterna[x] != null) contador++;
        }
        return contador;
    }

    @Override
    public boolean isEmpty() {
		if(miListaInterna == null) {
			return true;
		}
		else return false;
    }

    @Override
    public void push(Object value) {
        T temp[] = (T[]) new Object[miListaInterna.length + 5];

        System.arraycopy(miListaInterna, 0, temp, 0, miListaInterna.length);
        this.miListaInterna = temp;
        
    }

    @Override
    public T pull() {
        T temp[] = (T[]) new Object[miListaInterna.length];

        System.arraycopy(miListaInterna, 1, temp, 0, miListaInterna.length - 1);
        this.miListaInterna = temp;
        return temp[0];
    }

    @Override
    public T peek() {
        return miListaInterna[0];
    }
    
}
