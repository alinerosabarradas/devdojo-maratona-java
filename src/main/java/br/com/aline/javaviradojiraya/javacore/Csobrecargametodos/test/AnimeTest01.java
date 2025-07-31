package br.com.aline.javaviradojiraya.javacore.Csobrecargametodos.test;

import br.com.aline.javaviradojiraya.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Aline","TV", 12 );
        anime.init("Aline", "TV", 12, "Ação");
        anime.imprime();
    }
}
