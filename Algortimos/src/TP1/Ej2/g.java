package TP1.Ej2;

public class g {
    // Returns minimumIndex
    static int minimumIndex(int a[], int i, int j)
    {
        if (i == j)
            return i;

        int k = minimumIndex(a, i + 1, j);

        return (a[i] < a[k])? i : k;
    }
    static void recurSelectionSort(int a[], int n, int index)
    {

        if (index == n)
            return;

        int k = minimumIndex(a, index, n-1);

        if (k != index){
            // swap
            int temp = a[k];
            a[k] = a[index];
            a[index] = temp;
        }
        recurSelectionSort(a, n, index + 1);
    }
}
