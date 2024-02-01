import java.util.Vector;
public class Pila<T> {
    private Vector<T> stack;
    public Pila(){
        stack = new Vector<>();
    }
    public void push(T e){
        stack.add(e);
    }
    public T pop(){
        stack.remove(stack.size() - 1);
        return(stack.get(stack.size() - 1));
    }
    public T peek(){
        return(stack.get(stack.size() - 1));
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}