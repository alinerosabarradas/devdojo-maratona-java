package br.com.aline.javaviradojiraya.javacore.Eblocosinicializacao.dominio;

import java.sql.SQLOutput;

public class Anime {
        private String nome;
        private int[] episodios;
        // 1 - Alocado espaço em memória para o objeto
        // 2 - Cada atributo de classe é criado e inicializado com valores default ou que for passado
        // 3 - Bloco de inicialização é executado
        // 4 - Construtor é executado
    {
       System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + i;
        }
    }
        public Anime(String nome) {
            this.nome = nome;
        }

        public Anime() {

            for(int episodios: this.episodios){
                System.out.print(episodios + " ");
            }
            System.out.println();

        }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

