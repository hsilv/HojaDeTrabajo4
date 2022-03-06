package structures;

import java.util.Arrays;

public class StackUsingArray<T> implements IStack<T>
{
    private Object[] miListaInterna;

    public StackUsingArray(int largo)
    {
        miListaInterna = new Object [largo];
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
        
        
    }

    @Override
    public Object pull() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object peek() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
