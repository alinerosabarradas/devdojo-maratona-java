package br.com.aline.javaviradojiraya.javacore.Fmodificadorestatico.dominio;

    public class Desenho {
        private String nome;
        private static int[] episodios;
        // Troquei o nome ANIME pois estava dando conflito, não rodava
        // 0 - Bloco de inicialização é executado quando a JVM carregar classe
        // 1 - Alocado espaço em memória para o objeto
        // 2 - Cada atributo de classe é criado e inicializado com valores default ou que for passado
        // 3 - Bloco de inicialização é executado
        // 4 - Construtor é executado
        static {
            System.out.println("Dentro do bloco de inicializacao 1");
            episodios = new int[100];
            for (int i = 0; i < episodios.length; i++) {
                episodios[i] = i+1;
            }
        }
        static {
            System.out.println("Dentro do bloco de inicializacao 2");
        }
        static {
            System.out.println("Dentro do bloco de inicializacao 3");
        }

        public Desenho(String nome) {
            this.nome = nome;
        }

        public Desenho() {

            for(int episodios: Desenho.episodios){
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


