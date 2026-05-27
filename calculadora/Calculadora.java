package calculadora;

import java.util.List;

public class Calculadora {

    public static double promedio(List<? extends Number> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía o ser 0");
        }

        double suma = 0.0;
        for (Number numero : numeros) {
            suma += numero.doubleValue();
        }

        return suma / numeros.size();
    }

    public static double maximo(List<? extends Number> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía o ser 0");
        }

        double max = numeros.get(0).doubleValue();
        for (Number numero : numeros) {
            if (numero.doubleValue() > max) {
                max = numero.doubleValue();
            }
        }

        return max;
    }
}