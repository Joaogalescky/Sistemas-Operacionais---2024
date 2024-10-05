package Thread.atividade;

public class HellFromThreads implements Runnable{
    int tId;
    int[] vetor;
    int inicio, fim;

    public HellFromThreads(int tId, int[] vetor, int inicio, int fim) {
        this.tId = tId;
        this.vetor = vetor;
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public void run() {
        for(int i = inicio; i < fim; i++) {
            this.vetor[i] = tId + 10;
        }
    }
}