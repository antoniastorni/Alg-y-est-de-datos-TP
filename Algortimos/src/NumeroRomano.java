import java.util.HashMap;
import java.util.Scanner;

public class NumerosRomanos {
        private final HashMap<String, Integer> numeros;

        public NumeroRomano(){
            numeros= new HashMap<>();
            numeros.put("I", 1);
            numeros.put("V", 5);
            numeros.put("X", 10);
            numeros.put("L", 50);
            numeros.put("C", 100);
            numeros.put("D", 500);
            numeros.put("M", 1000);
        }
        //agregar excepciones de entrada erronea o escritura de numeros romanos erronea(pór las reglas de escritura)?
        public int aDecimal(String string) {
            string = string.toUpperCase();
            int aux = decimalValue(String.valueOf(string.charAt(string.length()-1)));
            for (int i = string.length()-1; i > 0; i--) {
                String last = String.valueOf(string.charAt(i));
                String before = String.valueOf(string.charAt(i - 1));
                if (decimalValue(before) >= decimalValue(last)) {
                    aux = aux + decimalValue(before);
                } else {
                    aux = aux - decimalValue(before);
                }
            }
            return aux;
        }

        private int decimalValue(String letter) {
            return numeros.get(letter);
        }
    }

public class Main {
    public static void main(String[] args) {
        NumeroRomano a = new NumeroRomano();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número romano:");
        String n = sc.nextLine();
        System.out.println("El numero romano en decimal es: " + a.aDecimal(n));
    }
}
