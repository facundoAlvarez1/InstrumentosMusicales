package models;

public class Acustica extends Cuerda{
    private int cuerda=6;
    private String tipoMadera;

    public Acustica() {
    }

    public Acustica(int cuerda, String tipoMadera) {
        this.cuerda = cuerda;
        this.tipoMadera = tipoMadera;
    }

    public Acustica(int precio, String marca, int cuerda, String tipoMadera) {
        super(precio, marca);
        this.cuerda = cuerda;
        this.tipoMadera = tipoMadera;
    }

    public int getCuerda() {
        return cuerda;
    }

    public void setCuerda(int cuerda) {
        this.cuerda = cuerda;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    @Override
    public String toString() {
        return "Acustica{" +
                "cuerda=" + cuerda +
                ", tipoMadera='" + tipoMadera + '\'' +
                '}'+ super.toString();

    }
}
