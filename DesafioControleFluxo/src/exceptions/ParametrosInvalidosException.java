package exceptions;

public class ParametrosInvalidosException {
    public static boolean primeiroNumeroMaior(int primeiroNumero, int segundoNumero) {
        return primeiroNumero >= segundoNumero;
    }

    public static boolean numerosIguais(int primeiroNumero, int segundNumero) {
        return primeiroNumero == segundNumero;
    }
}
