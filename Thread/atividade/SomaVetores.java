package Thread.atividade;

// C = A + B
// Requisitos:
// - deve ser usado os códigos das aulas teóricas como base (pacotes)
// - vetores contém valores do tipo primitivo double
// - preenchimento dos vetores A e B podem ser paralelos
// - a soma deve ocorrer para qualquer tamanho de vetor e qualquer quantidade de threads e em paralelo
// - verifique seu código com vetores pequenos antes de executar com vetores grandes
// - avalie o tempo de execução do código
// - - Processadores com até 4 Threads: avaliação com 1, 2 e 4 Threads
// - - Processadoers com até n Threads: avaliação com 1, 2, 4, 6, 8 .... Threads

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class SomaVetores {

    public static void preencherVetor(double[] vetor) {
        Random rand = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextDouble() * 100; // Valores aleatórios entre 0 e 100
        }
    }

    public static void somaVetores(double[] A, double[] B, double[] C) {
        int numThreads = Runtime.getRuntime().availableProcessors(); // Determina número de threads
        CompletableFuture<Void>[] futures = new CompletableFuture[numThreads]; 

        int parte = A.length / numThreads;
        // Calcula quantos elementos cada thread irá processar. 
        // Dividimos o tamanho total do vetor A pelo número de threads disponíveis para determinar a "parte" que cada thread irá somar.
        
        // Loop de threads
        for (int i = 0; i < numThreads; i++) {
            final int start = i * parte; // índice inicial do vetor
            final int end = (i == numThreads - 1) ? A.length : start + parte; // índice final do vetor

            futures[i] = CompletableFuture.runAsync(() -> { // Estamos criando uma nova tarefa assíncrona que será executada em uma thread separada
                for (int j = start; j < end; j++) {
                    C[j] = A[j] + B[j]; // Operação
                }
            });
        }

        CompletableFuture.allOf(futures).join(); // Aguarda todas as tarefas concluírem
    }

    public static void main(String[] args) {
        // Variáveis
        int tamanho = 10_000_000; // Tamanho do vetor
        // Criar vetores A, B, C
        double[] A = new double[tamanho];
        double[] B = new double[tamanho];
        double[] C = new double[tamanho];

        // Popular vetores A, B
        preencherVetor(A);
        preencherVetor(B);

        long startTime = System.nanoTime();
        somaVetores(A, B, C);
        long endTime = System.nanoTime();
        double tempoExecucao = (endTime - startTime) / 1_000_000_000.0; // Convertendo para segundos

        System.out.printf("Tempo de execução com %d thread(s): %.6f segundos%n", Runtime.getRuntime().availableProcessors(), tempoExecucao);
    }
}