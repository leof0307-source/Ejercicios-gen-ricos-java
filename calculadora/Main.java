package calculadora;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(" EJERCICIO 4:CALCULADORA ");

        // Prueba 1: Lista de Números Enteros (Integer)
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(10);
        listaEnteros.add(20);
        listaEnteros.add(30);
        listaEnteros.add(40);

        System.out.println("Lista de Enteros: " + listaEnteros);
        System.out.println("Promedio: " + Calculadora.promedio(listaEnteros));
        System.out.println("Máximo: " + Calculadora.maximo(listaEnteros));
        System.out.println("---------------------------------------");

        // Prueba 2: Lista de Números Decimale s (Double) (intento 3 si ven que esta algo mal pibes arreglenlo)
        List<Double> listaDecimales = new ArrayList<>();
        listaDecimales.add(5.5);
        listaDecimales.add(10.2);
        listaDecimales.add(3.8);
        listaDecimales.add(15.5);

        System.out.println("Lista de Decimales: " + listaDecimales);
        System.out.println("Promedio: " + Calculadora.promedio(listaDecimales));
        System.out.println("Máximo: " + Calculadora.maximo(listaDecimales));
    }
}