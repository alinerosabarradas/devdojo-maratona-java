package br.com.aline.javaviradojiraya.javacore.Aintroducaoclasses.test;


import br.com.aline.javaviradojiraya.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Volkswagen";
        carro1.ano = 1955;
        carro1.modelo = "Fusca";

        carro2.marca = "Volvo";
        carro2.ano = 2025;
        carro2.modelo = "C 40";

        carro1 = carro2;

        System.out.println("carro 1");
        System.out.println(carro1.marca);
        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);
        System.out.println("------------------------");
        System.out.println("Carro 2");
        System.out.println(carro2.marca);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);
    }


}

