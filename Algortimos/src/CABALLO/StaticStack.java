package CABALLO;

public interface StaticStack<T> {

    boolean isEmpty();
    T peek();
    void pop() throws IsEmptyException;
    void stack(T element);
    int size();
    void empty();
    void imprimirPila();
}
