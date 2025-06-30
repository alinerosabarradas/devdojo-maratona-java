package br.com.aline.java.javaviradojiraya;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        // int só funciona se for verdadeiro
        // if (se)
        int idade =15;
        boolean isAutorizadoComprarBebida = idade >= 18;

       // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
            // else significa "senão" e não podemos ter um else sem um if
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida");
        }else{

        }

        boolean c = true;
        if(c == false);{
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do if");


    }

}
