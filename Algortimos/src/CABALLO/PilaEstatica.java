package CABALLO;

public class PilaEstatica<T> implements StaticStack<T> {
    int tope;
    T[] pila;

    public PilaEstatica(){
        tope = -1;
        pila = (T[]) new Object[100000];
    }

    @Override
    public void stack(T o) {
        tope++;
        pila[tope] = o;
    }

    @Override
    public void pop() {
        pila[tope] = null;
        tope--;
    }

    @Override
    public T peek() {
        return pila[tope];
    }

    @Override
    public boolean isEmpty() {
        return tope == -1;
    }

    @Override
    public int size() {
        return tope;
    }

    @Override
    public void empty() {

    }

    @Override
    public void imprimirPila() {
        for (int i = 0; i < tope+1; i++) {
            System.out.println(pila[i]);
        }
    }
}
