package school.sptech;

public class Retangulo extends Figura {
    private Double base;
    private Double altura;

    public Retangulo() {}

    public Retangulo(Double base, Double altura, String cor, Integer espessura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Base = " + base +
                ", altura = " + altura +
                ", área = " + calcularArea();
    }
}