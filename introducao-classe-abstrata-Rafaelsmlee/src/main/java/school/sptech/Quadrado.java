package school.sptech;

public class Quadrado extends Figura {
    private Double lado;

    public Quadrado() {}

    public Quadrado(Double lado, String cor, Integer espessura) {
        super(cor, espessura);
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado com lado = " + lado +
                ", área = " + calcularArea();
    }
}