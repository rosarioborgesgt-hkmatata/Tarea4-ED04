/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;
/**
 * Clase con utilidades matematicas.
 *
 * @author Rosario Borges
 * @version 1.0
 * @since 2025
 */
public class Utilidades {

    /**
     * Comprueba si un anio es bisiesto.
     *
     * @param anio el anio a comprobar
     * @return true si es bisiesto, false si no
     */
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    /**
     * Convierte velocidad de km/h a m/s.
     *
     * @param kmh velocidad en kilometros por hora
     * @return velocidad en metros por segundo
     */
    public static double kmhAms(double kmh) {
        return kmh / 3.6;
    }
    /**
     * Convierte grados a radianes.
     *
     * @param grados angulo en grados
     * @return angulo en radianes
     */
    public static double gradosARadianes(double grados) {
        return grados * Math.PI / 180;
    }
    /**
     * Convierte grados, minutos y segundos a radianes.
     *
     * @param grados   grados del angulo
     * @param minutos  minutos del angulo
     * @param segundos segundos del angulo
     * @return angulo en radianes
     */
    public static double gradosARadianes(int grados, int minutos, int segundos) {
        return gradosARadianes(grados + (minutos / 60.0) + (segundos / 3600.0));
    }
    /**
     * Convierte temperatura de Celsius a Fahrenheit.
     *
     * @param celsius temperatura en grados Celsius
     * @return temperatura en grados Fahrenheit
     */
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    /**
     * Convierte temperatura de Fahrenheit a Celsius.
     *
     * @param fahrenheit temperatura en grados Fahrenheit
     * @return temperatura en grados Celsius
     */
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    /**
     * Calcula el area de un circulo.
     *
     * @param radio radio del circulo
     * @return area del circulo
     */
    public static double areaCirculo(double radio) {
        return Math.PI * alCuadrado(radio);
    }
    /**
     * Calcula la longitud de una circunferencia.
     *
     * @param radio radio de la circunferencia
     * @return longitud de la circunferencia
     */
    public static double longitudCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }
    /**
     * Calcula el cuadrado de un numero.
     *
     * @param num numero a elevar al cuadrado
     * @return el numero elevado al cuadrado
     */
    public static double alCuadrado(double num) {
        return Math.pow(num, 2.0);
    }
    /**
     * Calcula la hipotenusa de un triangulo rectangulo.
     *
     * @param cateto1 longitud del primer cateto
     * @param cateto2 longitud del segundo cateto
     * @return la hipotenusa calculada
     */
    public static double hipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(alCuadrado(cateto1) + alCuadrado(cateto2));
    }
    /**
     * Calcula un cateto conociendo la hipotenusa y el otro cateto.
     *
     * @param hipotenusa longitud de la hipotenusa
     * @param cateto     longitud del cateto conocido
     * @return longitud del cateto desconocido
     */
    public static double catetoA(double hipotenusa, double cateto) {
        return Math.sqrt(alCuadrado(hipotenusa) - alCuadrado(cateto));
    }
    /**
     * Convierte velocidad de mph a km/h.
     *
     * @param mph velocidad en millas por hora
     * @return velocidad en kilometros por hora
     */
    public static double mphAKmh(double mph) {
        return mph * 1.60934;
    }
    /**
     * Convierte velocidad de km/h a mph.
     *
     * @param kmh velocidad en kilometros por hora
     * @return velocidad en millas por hora
     */
    public static double kmhAMph(double kmh) {
        return kmh / 1.60934;
    }

}
