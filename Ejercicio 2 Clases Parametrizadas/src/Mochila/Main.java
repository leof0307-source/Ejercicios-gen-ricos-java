package Mochila;

public class Main {
    public static void main(String[] args) {

        Mochila<Moneda> mochilaGenerica = new Mochila<Moneda>();
        Mochila<Banana> mochilaBanana= new Mochila<Banana>();
        Banana banana=new Banana("Buena",8);
        Moneda m1 = new Moneda(10);
        Moneda m2 = new Moneda(50);

        mochilaGenerica.guardar(m1);
        mochilaGenerica.guardar(m2);
        mochilaBanana.guardar(banana); // esto lo hago solamente para demostrar que puedo reutilizar el codigo de Mochila

        System.out.println("contenido de mochila genérica ---");
        mochilaGenerica.mostrarInventario();


        MochilaDeMonedas mochilaEspecifica = new MochilaDeMonedas();

        mochilaEspecifica.guardar(m1);
        mochilaEspecifica.guardar(m2);

        System.out.println("contenido de mochila de monedas");
        mochilaEspecifica.mostrarInventarioEspecífico();

    }
}