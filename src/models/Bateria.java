package models;

public class Bateria extends InstrumentoMusical {
    private int tambores = 3;
    private int platillo = 1;

    public Bateria() {
    }

    public Bateria(int tambores, int platillo) {
        this.tambores = tambores;
        this.platillo = platillo;
    }

    public Bateria(String marca, int tambores, int platillo) {
        super(tambores * 3000 + platillo * 2000, marca);
        if (tambores > 3) {
            System.out.println("Por favor ingrese menos de 3 tambores");
        } else {
            this.tambores = tambores;
        }
        if (platillo >= 1 && platillo <= 5) {
            this.platillo = platillo;
        } else {
            System.out.println("Por favor ingrese los platillos entre 1 y 5");
        }
    }

    public int getTambores() {
        return tambores;
    }

    public void setTambores(int tambores) {
        this.tambores = tambores;
    }

    public int getPlatillo() {
        return platillo;
    }

    public void setPlatillo(int platillo) {
        this.platillo = platillo;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "tambores=" + tambores +
                ", platillo=" + platillo +
                '}' + super.toString();
    }
}
