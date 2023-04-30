import models.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InstrumentoMusical> listaInstrumento = new ArrayList<>();

        Bateria bat = new Bateria("Super Bat", 2, 3);
        Electrica e = new Electrica(12000, "Super electrica", 6, "rc345");
        Acustica a = new Acustica(10000, "Super Acustica", 6, "Caboa");
        Bajo b = new Bajo(15000, "Super Bajo", 4, "RXBAJO234");

        listaInstrumento.add(bat);
        listaInstrumento.add(e);
        listaInstrumento.add(a);
        listaInstrumento.add(b);

        System.out.println();
        for (InstrumentoMusical i : listaInstrumento) {
            System.out.println(i.toString());
        }

        System.out.println();
        e.sonidoAmplificador();
        b.sonidoAmplificador();
        System.out.println();

        for (InstrumentoMusical i : listaInstrumento) {
            switch (i.getClass().getSimpleName()) {
                case "Acustica":
                    System.out.println("ACUSTICA");
                    System.out.println("Precio Anterior:" + i.getPrecio());
                    i.aplicaDescuento(10);
                    System.out.println("Precio con descuento:" + i.getPrecio());
                    System.out.println();
                    break;
                case "Electrica":
                    System.out.println("ELECTRICA");
                    System.out.println("Precio Anterior:" +i.getPrecio());
                    i.aplicaDescuento(5);
                    System.out.println("Precio con descuento:" +i.getPrecio());
                    System.out.println();
                    break;
                case "Bateria":
                    System.out.println("BATERIA");
                    System.out.println("Precio Anterior:" +i.getPrecio());
                    i.aplicaDescuento(15);
                    System.out.println("Precio con descuento:" +i.getPrecio());
                    System.out.println();
                    break;
                case "Bajo":
                    System.out.println("BAJO");
                    System.out.println("Precio Anterior:" +i.getPrecio());
                    i.aplicaDescuento(20);
                    System.out.println("Precio con descuento:" +i.getPrecio());
                    System.out.println();
                    break;
                default:
                    break;
            }
        }
    }
}
