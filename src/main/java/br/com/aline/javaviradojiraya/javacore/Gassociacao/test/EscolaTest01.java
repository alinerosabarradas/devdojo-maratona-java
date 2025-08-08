package br.com.aline.javaviradojiraya.javacore.Gassociacao.test;

import br.com.aline.javaviradojiraya.javacore.Gassociacao.dominio.Escola;
import br.com.aline.javaviradojiraya.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Maria");
        Professor professor2 = new Professor("Joao");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Linus Pauling", professores);

        escola.imprime();

    }
}
