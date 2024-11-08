package br.com.felipe.inter.main;

import br.com.felipe.inter.formas.Circulo;
import br.com.felipe.inter.formas.Retangulo;
import br.com.felipe.inter.formas.Triangulo;
import br.com.felipe.inter.inter.AreaCalculavel;

public class Main {
    public static void main(String[] args) {

        AreaCalculavel retangulo = new Retangulo(15, 8);
        AreaCalculavel circulo = new Circulo(7);
        AreaCalculavel triangulo = new Triangulo(13, 32);

        // Calculando e exibindo a área de cada forma
        System.out.println("Áreas das formas:");
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
    }
}
