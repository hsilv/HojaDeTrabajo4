package structures;


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
    public void push(T value) {
        if(!isEmpty())
        {
            if(count() - 1 == miListaInterna.length - 1) extender();
            System.arraycopy(this.miListaInterna, 0, this.miListaInterna, 1, miListaInterna.length - 1);
        }
        this.miListaInterna[0] = value;
    }

    @Override
    public T pull() {
        T temp = this.miListaInterna[0];
        if(count() == miListaInterna.length - 1) extender();
        System.arraycopy(miListaInterna, 1, miListaInterna, 0, miListaInterna.length - 1);
        return temp;
    }

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
