import java.util.Random;
import java.util.UUID;

import so.memory.AdressMemory;

// Esta classe representa um processo no sistema operacional.
public class Process {
    private String id; // Identificador único do processo
    private int sizeInMemory; // Tamanho do processo na memória
    private int timeToExecute; // Tempo necessário para execução do processo
    private int priority; // Prioridade do processo
    private List<Process> processes; // Lista de processos
    private int instructions; // Número de instruções do processo
    private AdressMemory adress; // Endereço de memória do processo

    // Construtor que inicializa um processo com o tamanho especificado na memória.
    public Process(int sizeInMemory) {
        this.id = UUID.randomUUID().toString(); // Gerar um ID único para o processo
        //Random r = new Random();
        // List<Integer> numbers = Arrays.asList(1,2,4,6,10,20,50,100); // Lista de números utilizada, mas não utilizada no código
        this.sizeInMemory = sizeInMemory; // Definir o tamanho do processo
    }

    // Método para obter o ID do processo.
    public String getId() {
        return id;
    }

    // Método para definir o ID do processo.
    public void setId(String id) {
        this.id = id;
    }

    // Método para obter o tamanho do processo na memória.
    public int getSizeInMemory() {
        return sizeInMemory;
    }

    // Método para definir o tamanho do processo na memória.
    public void setSizeInMemory(int sizeInMemory) {
        this.sizeInMemory = sizeInMemory;
    }

    // Método para definir o endereço de memória do processo.
    public void setAdress(AdressMemory address) {
        this.adress = address;
    }

    // Métodos adicionais para o tempo de execução, prioridade, lista de processos e número de instruções
    // podem ser adicionados conforme necessário, mas estão ausentes neste código.
}

//Este código representa a classe Process, que define um processo no sistema operacional. Aqui está uma explicação detalhada com comentários:

//Process é uma classe pública que reside no pacote so.
//Ela tem vários atributos:
//id: Um identificador único para o processo, gerado aleatoriamente usando UUID.randomUUID().toString().
//sizeInMemory: O tamanho do processo na memória.
//timeToExecute: O tempo necessário para executar o processo (não utilizado neste código).
//priority: A prioridade do processo (não utilizado neste código).
//processes: Uma lista de processos (não utilizado neste código).
//instructions: O número de instruções do processo (não utilizado neste código).
//adress: O endereço de memória do processo, representado por AdressMemory (não utilizado neste código).
//O construtor Process recebe o tamanho do processo na memória como parâmetro e inicializa o ID do processo e o tamanho na memória.
//Métodos getters e setters são fornecidos para acessar e modificar os atributos do processo.












