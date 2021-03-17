package TPMINIBLAST;

public class MiniBlast2 {
    public double search(char[] query, char[] reference){ //basicamente va sumando los que son similares y como no importa la cantidad consecutiva, hace un porcentaje final solo con eso;
        int matches = 0;
        for (int i = 0; i < query.length; i++) {
            if(query[i] == reference[i]){
                matches++;
            }
        }
        return ((double) matches/query.length) * 100;
    }
    public double search(char[] query, char[] reference, double[] ponderacion){ //pide la ponderacion de cada valor que puede llegar a encontrar
        int[] inARow = iniciar(ponderacion.length); //un array que tiene los mismos espacios en este lugar se guardaran la cantidad de veces que se encontro cierta cantidad de repetidos
        int aux = 0;
        for (int i = 0; i < query.length; i++) { // for que va buscando los similares, cuando un grupo no es similar, se suma uno en la cantidad donde fue y aux se hace 0;
            if(query[i] == reference[i]){
                aux++;
            }else{
                inARow[aux-1]++;
                aux = 0;
            }
            if(query.length-1 == i) {
                inARow[aux-1]++;
            }
        }
        for (int i = 0; i < inARow.length; i++) {
            System.out.println(inARow[i]);
        }
        return (ponderacion(inARow, ponderacion)/query.length) * 100; // retorna porcentaje ponderado
    }

    public int[] iniciar(int a){ //crea un array con todos los valores en 0, asi podemos usar el ++;
        int[] array = new int[a];
        for (int i = 0; i < array.length ; i++) {
            array[i] = 0;
        }
        return array;
    }

    public double ponderacion(int[] a, double[] b){  // multiplica la cantidad de repetidos por el valor de ponderacion que se le asigno y retorna un valor sumado de la cantidad de "matches" ya ponderados.
        double aux = 0;
        for (int i = 0; i < a.length; i++) {
            aux+=(a[i] * (i+1) * b[i]);
        }
        return aux;
    }
    public static void main(String[] args) {
        char[] query = {'A', 'C', 'T', 'C', 'A', 'G', 'T', 'A', 'C', 'T'};
        char[] reference = {'A', 'G', 'T', 'C', 'A', 'T', 'T', 'A', 'G', 'T'};
        MiniBlast2 m = new MiniBlast2();
        double[] ponderation = {0.3, 0.7, 1.0, 1.3, 1.7};
        System.out.println("Porcentaje de parecido: " + m.search(query, reference, ponderation) + "%");
    }
}
