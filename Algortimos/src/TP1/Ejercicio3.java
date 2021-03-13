package TP1;

import java.util.ArrayList;

public class Ejercicio3<T> {
    EjercicioMerge ejercicioMerge;
    
    public T[] merge(T[] a, T[] b, int clength){
        int i = 0;
        int j = 0;
        T[] c = (T[]) new Object[clength];
        for (int k = 0; k < clength ; k++) {
          if(i < a.length && j < b.length) {
              if (ejercicioMerge.condition(a[i], b[j])) {
                  c[k] = a[i];
                  i++;
              } else if (!ejercicioMerge.condition(a[i], b[j])) {
                  c[k] = b[j];
                  j++;
              }
          }else if(i == a.length){
              c[k] = b[j];
              j++;
          }else{
              c[k] = a[i];
              i++;
          }
        }
        return c;
    }
}
