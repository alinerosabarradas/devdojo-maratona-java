package br.com.aline.javaviradojiraya.javacore.Bintroducaometodos.test;

import br.com.aline.javaviradojiraya.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(20,2));
        System.out.println("-----------------------");
        calculadora.imprimeDivisaoDeDoisNumeros02(85,0);

    }
}
