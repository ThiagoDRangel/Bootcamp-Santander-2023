import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner leitorDeEntradas = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        float valorSalario = leitorDeEntradas.nextFloat();

        System.out.print("Digite o valor adicional do benefício: ");
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;

        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorSalario;
        }
        else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
            valorImposto = 0.10F * valorSalario;
        }
        else {
            valorImposto = 0.15F * valorSalario;
        }

        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println("----------------------------------------");
        System.out.println(String.format("O salario liquido do funcionário é R$ %.2f", saida));
    }
}