package br.com.aline.javaviradojiraya.javacore.Aintroducaoclasses.test;

import br.com.aline.javaviradojiraya.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();


        professor.nome = "Joao";
        professor.idade = 20;
        professor.sexo = 'F';
        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.sexo);{

            System.out.println("---------------------");
    }
        Professor professor2 = new Professor();
        professor2.nome = "Joao";
        professor2.idade = 20;
        professor2.sexo = 'F';
        System.out.println("Nome:" + professor2.nome + " idade:" + professor.idade + " sexo:" + professor.sexo);


}
}