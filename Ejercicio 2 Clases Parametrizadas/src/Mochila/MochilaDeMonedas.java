package Mochila;

import java.util.ArrayList;

public class MochilaDeMonedas {
    private String nombre;
    private int valor;
    private ArrayList<Moneda> inventario = new ArrayList<>();

    // Recibe SÓLO monedas
    public void guardar(Moneda moneda) {
        this.inventario.add(moneda);
    }

    public void mostrarInventarioEspecífico() {
        for (Moneda m : this.inventario) {
            System.out.println(m.getValor());
        }
    }
}
