package pkg21demayo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ejecutarPrograma();
    }

    private static void ejecutarPrograma() {

        String opcion = mostrarMenu();
        switch (opcion) {
            case "1":
        }
    }

    private static String mostrarMenu() {
        Scanner entry = new Scanner(System.in);
        String opcion;
        System.out.println("BIENVENIDO A LA RECREACION DEL 21 DE MAYO");
        System.out.println("elija un modo de juego por su numero");
        System.out.println("1. Solo");
        System.out.println("2. PvP");
        System.out.println("3. Salir");
        opcion = entry.nextLine();
        return opcion;

    }
    private static String combateIA(){
        
    }
}
