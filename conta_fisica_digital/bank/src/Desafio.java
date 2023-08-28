import java.util.Scanner;
import cofres.CofreDigital;
import cofres.CofreFisico;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tipo de conta: |--Digital--| OU |--Fisica--|: ");
        String tipoCofre = scanner.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital")) {
            System.out.print("Digite sua senha: ");
            int senha = scanner.nextInt();
            scanner.nextLine();

            CofreDigital cofreDigital = new CofreDigital(senha);

            System.out.print("Confirme a sua senha: ");
            int confirmacaoSenha = scanner.nextInt();
            scanner.nextLine();
            System.out.println("-----------------------------------");
            cofreDigital.imprimirInformacoes();

            if (!cofreDigital.validarSenha(confirmacaoSenha)) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Cofre aberto!");
            }
        } else {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        }
        System.out.println("-----------------------------------");
    scanner.close();
    }
}
