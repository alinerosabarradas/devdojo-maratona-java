package br.com.aline.javaviradojiraya.javacore.Bintroducaometodos.dominio;

public class Funcionario {

       private String nome;
       private int idade;
       private double[] salarios;
       private double media = 0;


       public void imprime () {
            System.out.println(this.nome);
            System.out.println(this.idade);
            if (salarios == null) {
                return;
            }
            for (double salario : salarios) {
                System.out.print(salario + "");
            }
            imprimeMediaSalario();
        }

        public void imprimeMediaSalario() {
            if  (salarios == null) {
                return;
            }

            for (double salario : salarios) {
                media += salario;

            }
            media /= salarios.length;

            System.out.println("\nMedia Salarial "+ media);
        }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double setMedia() {
       return media;
    }
}



