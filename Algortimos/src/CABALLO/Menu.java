package CABALLO;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    MovimientoCaballo caballo = new MovimientoCaballo();

    public static void main(String[] args) {
        System.out.print("Elegir lugar inicial: ");
        String inicio = sc.nextLine();
        while(true) {
            System.out.println("• 1: Se procede a realizar el siguiente salto.\n" +
                    "• 2: Mostrar el contenido de las pilas.\n" +
                    "• 3: Salir.\n");
            System.out.println("Ingrese una opción: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:

                case 2:
                case 3:
                    System.exit(0);
            }
        }
    }

    private static void siguienteSalto(){
        System.out.print("Ingrese una posición: ");
        String posicion = sc.nextLine();

    }

    private static void mostrarPilas(){

    }
}
