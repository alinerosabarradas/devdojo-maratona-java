package br.com.aline.javaviradojiraya.javacore.Aintroducaoclasses.test;

import br.com.aline.javaviradojiraya.javacore.Aintroducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
       // pessoa.nome = "Aline";
        pessoa.setNome("Aline");
        pessoa.setIdade(70);
        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
