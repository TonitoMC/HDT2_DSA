import java.util.Vector;

/**
 * Esta clase es la implementacion de un Stack que toma genericos utilizando vectores
 * @author Jose Merida - 201105
 * @author Adrian Lopez - 21357
 * @version 1.0
 * @since 01-02-2024
 * */
public class Pila<T> {
    private Vector<T> stack;

    /**
     * Constructor de la clase, crea un vector vacio al crear una nueva Pila
     */
    public Pila(){
        stack = new Vector<>();
    }

    /**
     * Agrega un elemento al final de la lista
     * @param e el elemento a agregar
     */
    public void push(T e){
        stack.add(e);
    }

    /**
     * Remueve el elemento al final del vector y lo retorna
     * @return el elemento al final del vector
     */
    public T pop(){
        stack.remove(stack.size() - 1);
        return(stack.get(stack.size() - 1));
    }

    /**
     * Retorna el elemento al final del vector sin removerlo de la lsita
     * @return
     */
    public T peek(){
        return(stack.get(stack.size() - 1));
    }

    /**
     * Verifica si la pila esta vacia
     * @return True si esta vacia, False si contiene algun elemento
     */
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
