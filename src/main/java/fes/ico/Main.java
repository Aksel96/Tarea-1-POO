package fes.ico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe tu Nombre, Profesion y Pais de origen: ");
        String[] entrada = teclado.nextLine().trim().split(" ");
        for (int i = 0; i < 3; i++) {
            System.out.println("+----------------------+");
            if (i == 0) {
                System.out.println("    Nombre: " + entrada[i]);
            }
            if (i == 1){
                System.out.println("    Profesion: " + entrada[i]);
            }
            if (i == 2){
                System.out.println("    Pais: " + entrada[i]);
            }
            System.out.println("+----------------------+");
        }
    }
}