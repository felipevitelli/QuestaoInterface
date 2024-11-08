package br.com.felipe.inter.formas;

import br.com.felipe.inter.inter.AreaCalculavel;

//Interface
public class Retangulo implements AreaCalculavel {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
