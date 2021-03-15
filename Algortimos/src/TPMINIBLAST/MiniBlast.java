package TPMINIBLAST;

public class MiniBlast {

    public int search(char[] query, char[] reference) {
        int matches = 0;
        int inARow = 0;
        int aux = 0;
        for (int i = 1; i < query.length+1; i++) {
            if (query[i-1] == reference[i-1]) {
                matches++;
                if(i >= 2 && query[i-2] == reference[i-2]) {
                    aux++;
                }
                if(i <= query.length-1 && query[i+1] == reference[i+1]) {
                    aux++;
                    i++;
                }
            }
            inARow =+ aux;
            aux = 0;
        }
        System.out.println(matches);
        System.out.println(inARow);
        return percentage(matches, inARow, query.length);
    }
    //porcentaje tomando en cuenta cuenta la cantidad de matches sobre el total de caracteres
    private int percentage(int matches, int sequenceLength) {
        return (matches / sequenceLength) * 100;
    }

    //porcentaje tomando en cuenta la cantidad de matches y la cantidad de matches seguidos.
    //elegimos como ponderación un 40% de importancia a los matches y un 60% a los matches seguidos sobre los matches totales
    private int percentage(int matches, int inARow, int sequenceLength) {
        int matchesPercentage = percentage(matches, sequenceLength);
        int inARowPercentage = (inARow/matches) * 100;
        return (int) (matchesPercentage * 0.4 + inARowPercentage * 0.6);
    }

    public static void main(String[] args) {
        char[] query = {'A', 'C', 'T', 'C', 'A', 'G', 'T', 'A', 'C', 'T'};
        char[] reference = {'A', 'G', 'T', 'C', 'A', 'T', 'T', 'A', 'G', 'T'};
        MiniBlast m = new MiniBlast();
        System.out.println("Porcentaje de parecido: " + m.search(query, reference) + "%");

    }
}
