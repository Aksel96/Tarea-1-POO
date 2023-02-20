/*
################################
#            UNAM              #
#        FES ARAGON            #
#            ICO               #
#            POO               #
#          TAREA 1             #
#    AKSEL VILLELA ANDRADE     #
################################

### Programa que pide por teclado un numbre, profesion y pais, y lo regresa ordenado. ###

*/
package fes.ico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Usamos scanner para pedir por teclado la cadena
        Scanner teclado = new Scanner(System.in); // creamos la instancia teclado
        System.out.print("Escribe tu Nombre, Profesion y Pais de origen: "); //Pedimos la cadena
        String[] entrada = teclado.nextLine().trim().split(" "); //Asignamos la cadena a un areglo de stings, limpiamos basura con trim y lo rebanamos con split
        //Ciblo for para imprimir la cadena ene l orden pedido
        for (int i = 0; i < 3; i++) {
            System.out.println("+-----------------------+");
            if (i == 0) {
                System.out.println("    Nombre: " + entrada[i]);
            }
            if (i == 1){
                System.out.println("    Profesion: " + entrada[i]);
            }
            if (i == 2){
                System.out.println("    Pais: " + entrada[i]);
            }
            System.out.println("+-----------------------+");
        }
    }
}