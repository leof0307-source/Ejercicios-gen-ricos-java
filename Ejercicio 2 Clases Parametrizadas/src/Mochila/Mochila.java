package Mochila;

import java.util.ArrayList;

public class Mochila<T>{
    private ArrayList<T> inventario = new ArrayList<>();

    public void guardar(T item){
        this.inventario.add(item);
    }
    public void mostrarInventario(){
        for(T item : this.inventario){
            System.out.println(item);
        }
    }

}
