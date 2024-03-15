package so;

import java.util.Objects;

import so.Schedule.Schedule;
import so.cpu.CpuManager;
import so.memory.MemoryManager;
import so.memory.Strategy;

// Esta classe representa as operações do sistema operacional.
public class SystemOperation {
    public static MemoryManager mm; // Gerenciador de memória
    public static CpuManager cm; // Gerenciador da CPU
    public static Schedule schedule; // Scheduler para escalonamento de processos

    // Método para realizar chamadas de sistema.
    public static Object systemCall(SystemCallType type, Process p, int i) {
        // Se a chamada de sistema for para criar um processo
        if (type.equals(SystemCallType.CREATE_PROCESS)) {
            // Se o gerenciador de memória ainda não foi inicializado, inicialize-o
            if (Objects.isNull(mm)) {
                mm = new MemoryManager();
            }
            // Se o gerenciador da CPU ainda não foi inicializado, inicialize-o
            if (Objects.isNull(cm)) {
                cm = new CpuManager();
            }
            // Retorna um novo processo com tamanho de 128
            return new Process(128);
        } else if (type.equals(SystemCallType.WRITE_PROCESS)) { // Se a chamada de sistema for para escrever em um processo
            // Chama o gerenciador de memória para escrever o processo usando a estratégia de alocação First Fit
            mm.write(p, Strategy.FIRST_FIT);
        } else if (type.equals(SystemCallType.DELETE_PROCESS)) { // Se a chamada de sistema for para deletar um processo
            // Aqui deveria ser chamado o método apropriado para deletar um processo do sistema, mas está vazio neste código
        } else if (type.equals(SystemCallType.READ_PROCESS)) { // Se a chamada de sistema for para ler um processo
            // Aqui deveria ser chamado o método apropriado para ler um processo do sistema, mas está vazio neste código
        }
        return null;
    }

    // Método para realizar chamadas de sistema específicas para criação de processo.
    public static Process systemCall(SystemCallType createProcess, int i) {
        // Este método deveria ser implementado para lidar com chamadas específicas para criação de processo,
        // mas está vazio neste código. Pode ser implementado de acordo com a necessidade do sistema.
        return null;
    }
}
