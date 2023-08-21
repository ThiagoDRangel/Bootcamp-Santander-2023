import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro número: ");
            int primeiroNumero = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int segundoNumero = sc.nextInt();

            if (!ParametrosInvalidosException.primeiroNumeroMaior(primeiroNumero, segundoNumero)) {
                throw new IllegalArgumentException("O primeiro número deve ser maior que o segundo");
            }

            if (ParametrosInvalidosException.numerosIguais(primeiroNumero,segundoNumero)) {
                throw new IllegalArgumentException("Os números não podem ser iguais, insira um valor maior no primeiro número");
            }

            int contagem = primeiroNumero - segundoNumero;

            for (int i = 1; i <= contagem; i++) {
                System.out.println("-----------------------------------");
                System.out.println("Imprimindo o número " + i);
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
