package br.com.felipe.inter.formas;

class Triangulo implements AreaCalculavel {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
