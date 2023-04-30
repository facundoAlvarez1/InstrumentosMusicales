package models;

public class Bajo extends Cuerda implements SonidoAmplificador{
    private int cuerda=4;
    private String nombreModelo;

    public Bajo() {
    }

    public Bajo(int cuerda, String nombreModelo) {
        this.cuerda = cuerda;
        this.nombreModelo = nombreModelo;
    }

    public Bajo(int precio, String marca, int cuerda, String nombreModelo) {
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
        return "Bajo{" +
                "cuerda=" + cuerda +
                ", nombreModelo='" + nombreModelo + '\'' +
                '}'+super.toString();
    }

    @Override
    public void sonidoAmplificador() {
        System.out.println("Bajo : SONIDO AMPLIFICADO");
    }
}
