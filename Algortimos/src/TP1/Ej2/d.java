package TP1.Ej2;

public class d {
    // Algoritmo de seleccion
    void selectionSort(String arr[]) {

        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j].compareTo(arr[min_idx]) == -1)
                    min_idx = j;

            String temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Algoritmo de insercion
    void insertionSort(String arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) == 1) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    // Algoritmo de burbujeo
    public static void bubbleSort(String[] A) {
        int i, j;
        String aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if ( A[j + 1].compareTo(A[j]) == -1 ) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }
}
