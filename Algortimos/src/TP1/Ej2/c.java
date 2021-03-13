package TP1.Ej2;

public class c {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (200 - 100) + 100);
        }
        //array. el método sort aqui xd

        printArray(array);
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

/* Tiempos para distintos valores de N con los distintos sorts
        Tiempo del selection: 3 s 532 ms
        Tiempo del insertion: 3 s 361 ms
        Tiempo del bubble: 3 s 995 ms
*/
