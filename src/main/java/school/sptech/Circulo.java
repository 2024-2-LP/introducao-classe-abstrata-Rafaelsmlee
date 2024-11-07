package school.sptech;

public class Circulo extends Figura {
    private Double raio;

    public Circulo() {}

    public Circulo(Double raio, String cor, Integer espessura) {
        super(cor, espessura);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "Raio = " + raio +
                ", área = " + calcularArea();
    }
}
