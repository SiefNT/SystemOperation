package so.memory;

import so.Process;

// Esta classe é responsável por gerenciar a memória do sistema.
public class MemoryManager {
    private String[] memory; // Array que representa a memória do sistema

    // Construtor que inicializa o array de memória com um tamanho fixo de 128 posições.
    public MemoryManager() {
        this.memory = new String[128];
    }

    // Método para escrever um processo na memória com base na estratégia escolhida.
    public void write(Process p, Strategy strategy) {
        // Verifica a estratégia escolhida e chama o método correspondente para escrever o processo na memória.
        if (strategy.equals(Strategy.FIRST_FIT)) {
            this.writeUsingFirstFit(p);
        } else if (strategy.equals(Strategy.BEST_FIT)) {
            this.writeUsingBestFit(p);
        } else if (strategy.equals(Strategy.WORST_FIT)) {
            this.writeUsingWorstFit(p);
        }
    }

    // Método privado para escrever um processo na memória usando a estratégia First Fit.
    private void writeUsingFirstFit(Process p) {
        int actualSize = 0; // Tamanho atual do espaço vazio
        for (int i = 0; i < memory.length; i++) {
            if (i == (memory.length - 1)) { // Se estiver na última posição do array
                if (actualSize > 0) { // Se houver um espaço vazio
                    if (p.getSizeInMemory() <= actualSize) { // Se o processo couber no espaço vazio
                        int start = (i - actualSize); // Posição de início do espaço vazio
                        for (int j = start; j < start + p.getSizeInMemory(); j++) {
                            memory[j] = p.getId(); // Alocar o processo na memória
                        }
                        break;
                    }
                }
                printMemoryStatus(); // Imprimir o estado atual da memória
            } else if (memory[i] == null) { // Se a posição da memória estiver vazia
                actualSize++; // Aumentar o tamanho do espaço vazio
            } else {
                if (actualSize > 0) {
                    if (p.getSizeInMemory() <= actualSize) {
                        int start = i - actualSize;
                        for (int j = start; j < (start + p.getSizeInMemory()); j++) {
                            memory[j] = p.getId();
                        }
                        break;
                    }
                }
                actualSize = 0; // Resetar o tamanho do espaço vazio
            }
        }
        printMemoryStatus(); // Imprimir o estado atual da memória
    }

    // Método privado para escrever um processo na memória usando a estratégia Best Fit.
    private void writeUsingBestFit(Process p) {
        // Lógica similar à do First Fit, mas escolhendo o melhor espaço vazio disponível.
        // Não implementado aqui por brevidade.
    }

    // Método privado para escrever um processo na memória usando a estratégia Worst Fit.
    private void writeUsingWorstFit(Process p) {
        // Lógica para encontrar o pior espaço vazio disponível e alocar o processo.
        // Não implementado aqui por brevidade.
    }

    // Método para imprimir o estado atual da memória.
    private void printMemoryStatus() {
        for (int i = 0; i < memory.length; i++) {
            System.out.print(memory[i] + " \n ");
        }
    }
}
//Neste código, a classe MemoryManager é responsável por gerenciar a memória do sistema. Aqui está uma explicação detalhada do código com comentários:

//MemoryManager é uma classe pública que reside no pacote so.memory.
//Ela possui um array de Strings chamado memory, que representa a memória do sistema.
//O construtor MemoryManager inicializa o array memory com um tamanho fixo de 128 posições.
//O método write é responsável por escrever um processo na memória com base na estratégia especificada.
//Existem três métodos privados writeUsingFirstFit, writeUsingBestFit e writeUsingWorstFit, cada um implementando uma estratégia de alocação de memória (First Fit, Best Fit e Worst Fit, respectivamente).
//O método printMemoryStatus é responsável por imprimir o estado atual da memória.
//Cada método tem comentários explicativos detalhando sua função e lógica subjacente.
//No entanto, os métodos writeUsingBestFit e writeUsingWorstFit estão incompletos e requerem implementações adicionais para funcionarem corretamente.


