package br.com.felipe.inter.formas;

class Circulo implements AreaCalculavel {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    // Implementação do método calcularArea para o Círculo
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
