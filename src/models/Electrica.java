package models;

public class Electrica extends Cuerda implements SonidoAmplificador{
    private int cuerda=6;
    private String nombreModelo;

    public Electrica() {
    }

    public Electrica(int cuerda, String nombreModelo) {
        this.cuerda = cuerda;
        this.nombreModelo = nombreModelo;
    }

    public Electrica(int precio, String marca, int cuerda, String nombreModelo) {
        super(precio, marca);
        this.cuerda = cuerda;
        this.nombreModelo = nombreModelo;
    }

    public int getCuerda() {
        return cuerda;
    }

    public void setCuerda(int cuerda) {
        this.cuerda = cuerda;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    @Override
    public String toString() {
        return "Electrica{" +
                "cuerda=" + cuerda +
                ", nombreModelo='" + nombreModelo + '\'' +
                '}'+ super.toString();
    }

    @Override
    public void sonidoAmplificador() {
        System.out.println("Electrica: SONIDO AMPLIFICADO");
    }
}
