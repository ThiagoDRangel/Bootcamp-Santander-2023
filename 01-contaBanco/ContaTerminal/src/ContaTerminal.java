import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ContaTerminal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Digite o número da agencia: ");
        String agencia = sc.next();
        System.out.print("Digite o nome do cliente: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();
        account = new Account(numero, agencia, nomeCliente);

        System.out.println();
        System.out.println(account.toString());

        sc.close();
    }
}