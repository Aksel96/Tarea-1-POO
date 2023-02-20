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
        //Primero hacemos un split de toda la cadena para hacer verificacion de si tiene un numero
        String entrada = teclado.nextLine().trim();
        //Arreglo de la cadena spliteada elemento por elemento para comprobar si hay un numero
        String[] comprobacionEntrada = entrada.split("");
        //Llamamos a la funcion de comprobacion, para ver si hay un numero en la cadena
        boolean resultadoComprobacion = verificaNumero(comprobacionEntrada);
        //Ciclo for para imprimir la cadena ene l orden pedido
        if (!resultadoComprobacion){
            //Creamos una cadena y la splitemos con los datos validos
            String[] datosUsuario = entrada.trim().split(" ");
            //Comprobamos que la longitud de la cadena
            if (datosUsuario.length < 1 || datosUsuario.length > 3){
                System.out.println("\n ---> ERROR, NUMERO DE PALABRAS INCORRECTAS <-- \n \t \t (Deben ser tres palabras) \n \n");
            }else{
                //De ser 3 el largo de la cadena continuamos
                //Iteramos la cadena para imprimir la informacion
                for (int i = 0; i < 3; i++) {
                    System.out.println("+-----------------------+");
                    if (i == 0) {
                        System.out.println("    Nombre: " + datosUsuario[i].toUpperCase());
                    }
                    if (i == 1){
                        System.out.println("    Profesion: " + datosUsuario[i].toUpperCase());
                    }
                    if (i == 2){
                        System.out.println("    Pais: " + datosUsuario[i].toUpperCase());
                    }
                    System.out.println("+-----------------------+");
                }}
        }else {
                System.out.println("\nCARACTERES NO VALIDOS, POR FAVOR INTRODUCE OTROS \n\t(--> ¡No se admiten numeros! <--)\n");
            }
    }
    //Funcion para verificar si hay un numero en la cadena
    public static boolean verificaNumero(String[] entrada){

        for (String elemento:entrada){
            //Usamos un control de excepciones para ver si se puede castear de string a entero
            try {
                int compruebaNumero = Integer.parseInt(elemento);
                    return true;

            }catch (NumberFormatException e){//Si no se puede hacer casting, continua con el bucle
            }
        }
        return false;
    }
}
