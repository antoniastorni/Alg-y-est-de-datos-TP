package TP1;

public class Ejercicio1 {

    // busqueda secuencial en un conjunto de numeros enteros que devuelve
    // la posicion en donde se encuentra el valor a buscar
    public int SeqSearch ( int a[], int k) {
        for (int i = 0; i < a.length; i++)
            if (k == a[i])
                return i;
        return -1;
    }

    // busqueda binaria en un conjunto ordenado de numeros enteros que devuelve
    //    // la posicion en donde se encuentra el valor a buscar
    public int BinarySearch ( int a[], int k) {
        int min = 0;
        int max = a.length-1;
        int middle = (min+max)/2;
        while(min <= max) {
            if (k == a[middle])
                return middle;
            else if (k < a [middle] )
                max = middle-1;
            else
                min = middle +1;
            middle = (min+max)/2;
        }
        return -1;
    }

}
