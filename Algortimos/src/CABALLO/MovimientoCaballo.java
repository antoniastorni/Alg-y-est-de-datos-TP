package CABALLO;

import java.util.HashMap;

public class MovimientoCaballo {
    HashMap<Integer, String> denumeroaletra = new HashMap<>();
    static PilaEstatica<String> salto1 = new PilaEstatica();
    static PilaEstatica<String> salto2 = new PilaEstatica();
    static PilaEstatica<String> salto3 = new PilaEstatica();
    static PilaEstatica<String> salto4 = new PilaEstatica();
    int i = 1;

    public MovimientoCaballo(){
        denumeroaletra.put(1, "A");
        denumeroaletra.put(2, "B");
        denumeroaletra.put(3, "C");
        denumeroaletra.put(4, "D");
        denumeroaletra.put(5, "F");
        denumeroaletra.put(6, "G");
        denumeroaletra.put(7, "H");
        denumeroaletra.put(8, "I");
    }

    public void caballo(int a, int b){
        movimientosPosibles(a,b);
    }

    public void elegirPila(int x, int y, int i) {
        if (i == 1) {
            salto1.stack(denumeroaletra.get(y) + String.valueOf(x));
        }
        if (i == 2) {
            salto2.stack(denumeroaletra.get(y) + String.valueOf(x));
        }
        if (i == 3) {
            salto3.stack(denumeroaletra.get(y) + String.valueOf(x));
        }
        if (i == 4) {
            salto4.stack(denumeroaletra.get(y) + String.valueOf(x));
        }
    }

    public void movimientosPosibles(int x, int y){
        if (i <= 4) {
            if ((x - 1 > 0 && x - 1 < 9) && (y + 2 > 0 && y + 2 < 9)) {
                elegirPila(x - 1, y + 2, i);
            }

            if ((x + 1 > 0 && x + 1 < 9) && (y + 2 > 0 && y + 2 < 9)) {
                elegirPila(x + 1, y + 2, i);
            }

            if ((x + 1 > 0 && x + 1 < 9) && (y - 2 > 0 && y - 2 < 9)) {
                elegirPila(x + 1, y - 2, i);
            }
            if ((x - 1 > 0 && x - 1 < 9) && (y - 2 > 0 && y - 2 < 9)) {
                elegirPila(x - 1, y - 2, i);
            }

            if ((x + 2 > 0 && x + 2 < 9) && (y - 1 > 0 && y - 1 < 9)) {
                elegirPila(x + 2, y - 1, i);
            }

            if ((x - 2 > 0 && x - 2 < 9) && (y - 1 > 0 && y - 1 < 9)) {
                elegirPila(x - 2, y - 1, i);
            }
            if ((x + 2 > 0 && x + 2 < 9) && (y + 1 > 0 && y + 1 < 9)) {
                elegirPila(x + 2, y + 1, i);
            }
            if ((x - 2 > 0 && x - 2 < 9) && (y + 1 > 0 && y + 1 < 9)) {
                elegirPila(x - 2, y + 1, i);
            }
        }
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        MovimientoCaballo mc = new MovimientoCaballo();
        mc.caballo(1, 1);
        System.out.println("Pila 1");
        salto1.imprimirPila();
        System.out.println("Pila 2");
        salto2.imprimirPila();
        System.out.println("Pila 3");
        salto3.imprimirPila();
        System.out.println("Pila 4");
        salto4.imprimirPila();
        }
    }

