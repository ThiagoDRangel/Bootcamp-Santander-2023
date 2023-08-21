import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {

        System.out.println("Iniciando o Processo seletivo");
        System.out.println("--------------------------------");
        selecaoCandidatos();
    }
    static void selecaoCandidatos() {
        String [] candidatos = { "Jorge", "Carlos", "Miguel", "Thiago", "Julia", "Ana, juvenal, Antônio"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s não foi selecionado, salário pretendido R$%.2f%n%n",candidato, salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.printf("O candidato %s foi selecionado para a vaga, salário R$%.2f%n%n", candidato, salarioPretendido);                candidatosSelecionados++;
            }
            candidatoAtual+= 1;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }else if(salarioBase==salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        }else {
            System.out.println("Aguardando o resultado...");
        }
    }
}