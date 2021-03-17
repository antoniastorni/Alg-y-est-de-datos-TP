package TPMINIBLAST;

public class MiniBlast2 {
    public int search(char[] query, char[] reference){ //basicamente va sumando los que son similares y como no importa la cantidad consecutiva, hace un porcentaje final solo con eso;
        int matches = 0;
        for (int i = 0; i < query.length; i++) {
            if(query[i] == reference[i]){
                matches++;
            }
        }
        return matches/query.length;
    }
    public int search(char[] query, char[] reference, int[] ponderacion){ //pide la ponderacion de cada valor que puede llegar a encontrar
        int[] inARow = iniciar(ponderacion.length); //un array que tiene los mismos espacios en este lugar se guardaran la cantidad de veces que se encontro cierta cantidad de repetidos
        int aux = 0;
        for (int i = 0; i < query.length; i++) { // for que va buscando los similares, cuando un grupo no es similar, se suma uno en la cantidad donde fue y aux se hace 0;
            if(query[i] == reference[i]){
                aux++;
            }else{
                inARow[aux]++;
                aux = 0;
            }
        }
        return ponderacion(inARow, ponderacion)/query.length; // retorna porcentaje ponderado
    }

    public int[] iniciar(int a){ //crea un array con todos los valores en 0, asi podemos usar el ++;
        int[] array = new int[a];
        for (int i = 0; i < array.length ; i++) {
            array[i] = 0;
        }
        return array;
    }

    public int ponderacion(int[] a, int[] b){  // multiplica la cantidad de repetidos por el valor de ponderacion que se le asigno y retorna un valor sumado de la cantidad de "matches" ya ponderados.
        int aux = 0;
        for (int i = 0; i < a.length; i++) {
            aux+=(a[i] * b[i]);
        }
        return aux;
    }
}
