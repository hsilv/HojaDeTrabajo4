package structures;

public class Stack<T> {
    public static IStack<Integer> construir(int tipo){
        switch (tipo) {
            case 1:
                return new StackUsingArrayList<>();                
            case 2:
                //aqui va vector (Array)
                //return new StackUsingArrayList(); 
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
