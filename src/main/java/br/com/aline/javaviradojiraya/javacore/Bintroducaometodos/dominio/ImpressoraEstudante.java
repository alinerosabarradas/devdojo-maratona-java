package br.com.aline.javaviradojiraya.javacore.Bintroducaometodos.dominio;


public class ImpressoraEstudante {

    public void imprime(Estudante estudante){
        System.out.println("__________________");



        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        estudante.nome = "Gohan";
    }
}
