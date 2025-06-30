package br.com.aline.java.javaviradojiraya;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria audulto
        int idade = 12;
        String categoria;

        if(idade <15) {
            System.out.println("Categoria Infantil");
        }else if(idade >=15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        }else {
            System.out.println("categoria Adulto");
        }
    }
}
