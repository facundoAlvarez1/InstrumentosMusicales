package models;

public class InstrumentoMusical {
    private int precio;
    private String marca;

    public InstrumentoMusical() {
    }

    public InstrumentoMusical(int precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "InstrumentoMusical{" +
                "precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void aplicaDescuento(float porcentaje){
        double v = getPrecio()-((getPrecio() * porcentaje)/100);
        setPrecio((int) v);
    }
}
