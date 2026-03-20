/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea4;
/**
 * Clase principal del proyecto.
 *
 * @author Rosario Borges
 * @version 1.0
 * @since 2025
 */
public class Tarea4 {
/**
 * Metodo principal de ejecucion del programa.
 *
 * @param args argumentos de linea de comandos
 */
    public static void main(String[] args) {
        System.out.println("60mph son " + Utilidades.kmhAms(Utilidades.mphAKmh(60)) + " metros por segundo");
        System.out.println("Si el cateto A mide 3cm y el cateto B mide 4cm, entonces la hipotenusa mide "
                + Utilidades.hipotenusa(3, 4) + "cm");
    }

}
