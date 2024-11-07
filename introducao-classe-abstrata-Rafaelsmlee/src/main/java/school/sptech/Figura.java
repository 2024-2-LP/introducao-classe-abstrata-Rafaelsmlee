package school.sptech;

public abstract class Figura {
    private String cor;
    private Integer espessura;

    public Figura() {}

    public Figura(String cor, Integer espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }

    public abstract Double calcularArea();

    @Override
    public String toString() {
        return "Figura: " + this.getClass().getSimpleName() +
                ", cor: " + cor +
                ", espessura: " + espessura;
    }
}