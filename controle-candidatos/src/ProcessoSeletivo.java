import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    // Lista fixa de 10 candidatos
    static String[] candidatos = {"Felipe", "Junior", "Gabriel", "Gustavo", "Giovanna",
            "Alice", "Marta", "Eva", "Francisco", "Henrique"};
    static double[] salariosPretendidos = new double[10]; // Array para armazenar os salários

    public static void main(String[] args) {
        // 1. Gerar e analisar os salários dos candidatos
        for (int i = 0; i < candidatos.length; i++) {
            salariosPretendidos[i] = valorPretendido(); // Armazena o salário no array
            System.out.print(candidatos[i] + " - Salário pretendido: " + salariosPretendidos[i] + " → ");
            analisarCandidato(salariosPretendidos[i]);
        }

        // 2. Selecionar candidatos com salário <= 2000
        String[] selecionados = selecaoCandidatos();

        //3. Ligar para os candidatos selecionados
        System.out.println("\n=== LIGANDO PARA OS CANDIDATOS ===");
        for (String candidato : selecionados) {
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato) {
        int tentativas = 1;
        boolean atendeu = false;
        do {
            atendeu = atender(); // Simula se atendeu (33% de chance)
            if (atendeu) {
                System.out.println("CONTATO REALIZADO COM " + candidato + " NA " + tentativas + "ª TENTATIVA");
            } else if (tentativas >= 3) {
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " (NÚMERO MÁXIMO DE TENTATIVAS)");
                break;
            }
            tentativas++;
        } while (!atendeu);
    }

    //método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }


    // Método de seleção
    static String[] selecaoCandidatos() {
        String[] selecionados = new String[5]; // Array para os selecionados (máximo 5)
        int contagemselecionados = 0;

        System.out.println("\n=== CANDIDATOS SELECIONADOS ===");
        for (int i = 0; i < candidatos.length && contagemselecionados < 5; i++) {
            if (salariosPretendidos[i] <= 2000.0) {
                selecionados[contagemselecionados] = candidatos[i];
                System.out.println(candidatos[i] + " - Salário: " + salariosPretendidos[i]);
                contagemselecionados++;
            }
        }
        return selecionados;
    }

    // Métodos de analisar candidato
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO");
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}