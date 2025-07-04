package br.com.aline.javaviradojiraya.javacore.Aintroducaoclasses.test;


import br.com.aline.javaviradojiraya.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Clara Rosa";
        estudante.idade = 10;
        estudante.sexo = 'F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
    }
