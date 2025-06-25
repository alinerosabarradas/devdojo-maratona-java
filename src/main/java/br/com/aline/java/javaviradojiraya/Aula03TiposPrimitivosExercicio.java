package br.com.aline.java.javaviradojiraya;
/*
Prática
Crie variáveis para os campos descritos baixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>,
confirmo qye recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Aline";
        String endereco = "Rua janis Joplin";
        double salario = 1500.00;
        String dataRecebimentoSalario = "20/12/2025";
        String relatorio = "Eu "+nome+" morando no "+endereco+" confirmo que recebi o salário de "+salario+", na data de "+dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}
