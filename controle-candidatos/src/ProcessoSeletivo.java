import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {

        System.out.println("Iniciando o Processo seletivo");
        System.out.println("--------------------------------");
        selecaoCandidatos();
        imprimirSelecionados();
    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                tentativasRealizadas++;
            }else {
                System.out.println("Contato realizado com sucesso!!!");
            }
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu) {
            System.out.println("Contato realizado com " + candidato + "na " + tentativasRealizadas + " tentativa(s)");
        }else {
            System.out.println("Não foi possível entrar em contato com o candidato " + candidato + ", número de tentativas " + tentativasRealizadas);
        }
    }

    //simulando ligações aos candidatos
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Jorge", "Carlos", "Miguel", "Thiago", "Julia"};
        System.out.println("Imprimindo candidatos aprovatos com o índice");
        for(int indice=0; indice < candidatos.length;indice++) {
            System.out.println("O candidato n° " + (indice+1) + " é " + candidatos[indice]);
        }
        System.out.println("------------------------------------");
        System.out.println("Forma abreviada de interação usando for each");
        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
            System.out.println("----------------------------------");
            entrandoEmContato(candidato);
        }
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