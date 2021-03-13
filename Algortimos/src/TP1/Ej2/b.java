package TP1.Ej2;

public class b {
    // Algoritmo de seleccion
    public void selectionSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int maxValue = 0;
            for (int j = 0; j < i; j++) {
                if (array[j + 1] > array[maxValue]) {
                    maxValue = j + 1;
                }
            }
            swap(array, i, maxValue);
        }
    }
    public void swap(int[] array, int a, int b) {
        int value = array[b];
        array[b] = array[a];
        array[a] = value;
    }

    // Algoritmo de insercion
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    // Algoritmo de burbujeo
    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }
}
