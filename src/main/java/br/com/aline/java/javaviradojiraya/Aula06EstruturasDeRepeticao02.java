package br.com.aline.java.javaviradojiraya;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima os números pares de 0 até 1000000
      for (int i = 0; i < 1000000; i++) {
          if (i % 2 == 0) {
              System.out.println(i);
          }
      }
    }
}

