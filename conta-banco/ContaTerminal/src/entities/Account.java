package entities;

public class Account {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public Account(int numero, String agencia, String nomeCliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        return "Conta cadastrada com sucesso! \n" +
                numero + "\n" +
                "Cliente: " + nomeCliente + "\n" +
                "Saldo: $ " + String.format("%.2f", saldo);
    }

}