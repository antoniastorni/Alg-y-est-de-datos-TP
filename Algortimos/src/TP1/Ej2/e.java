package TP1.Ej2;

public class e<T> {
    Condition<T> condicion;
    public void selectionSort(T[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int maxValue = 0;
            for (int j = 0; j < i; j++) {
                if (condicion.condicion( array[j + 1], array[maxValue])) {
                    maxValue = j + 1;
                }
            }
            swap(array, i, maxValue);
        }
    }
    public void swap(T[] array, int a, int b) {
        T value = array[b];
        array[b] = array[a];
        array[a] = value;
    }

    // Algoritmo de insercion
    void sort(T arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            T key = arr[i];
            int j = i - 1;

            while (j >= 0 && condicion.condicion(arr[j], key)) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    // Algoritmo de burbujeo
    public  void burbuja(T[] A) {
        int i, j;
        T aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (condicion.condicion(A[j + 1], A[j])) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }
}
