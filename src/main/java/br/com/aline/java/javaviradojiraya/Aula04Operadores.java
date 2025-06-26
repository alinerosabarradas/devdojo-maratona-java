package br.com.aline.java.javaviradojiraya;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - /*
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double)numero02;
        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        //m<> <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("izDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("izDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("izDezIgaulVinte "+isDezIgualVinte);
        System.out.println("isDezIgaulDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        // && ( e - AND) || (ou - or) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario >+ 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDEntroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 500F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);
    }
}
