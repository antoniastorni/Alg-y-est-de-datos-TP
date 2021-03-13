package TP1;

public class Ejercicio2 {
    /* a)
        Algoritmo de seleccion:
        - Define un indice de particion (index) en la ultima posicion del arreglo
        - Define un indice i que recorre el arreglo
        - Define una variable maxValue como el elemento mayor
        - Busca el elemento mayor entre los elementos que se encuentran antes del index usando maxValue para determinarlo
        - El elemento mayor se intercambia con el elemento de la posicion del index
        - El index se reduce en uno
        - Se reinicia el valor del indice i a 0
        - Repite el proceso hasta que el arreglo completo se ordene

        Algoritmo de insercion:
        Para un array de tamaño n que se quiere ordenar en forma ascendente, se comienza por iterar desde array[1] hasta array[size-1].
        Para un n determinado, se compara el valor de su elemento con el valor de su predecesor (n-1).
        Si el valor de la posición a analizar es menor que su predecesor, se compara con el valor anterior (n-2) y así sucesivamente
        hasta encontrar un elemento i para el cual el elemento en n sea mayor, que es donde se ubica (i+1).
        Al analizarse cada elemento del array, se va dividiendo en un primer tramo inicial ordenado y uno desordenado que falta recorrer.

        Algoritmo de burbujeo:
        Compara pares de elementos adyacentes en un array y si están desordenanos intercambiarlos hasta que estén todos ordenados
     */

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
