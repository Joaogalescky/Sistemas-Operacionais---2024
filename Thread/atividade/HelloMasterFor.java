package Thread.atividade;

import Thread.modelo.HelloFromThreads;

public class HelloMasterFor {
    private int nThreads;
    private Thread[] vThreads;
    private int[] vetor;

    public HelloMasterFor(int nThreads, int[] vetor) {
        this.nThreads = nThreads;
        this.vThreads = new Thread[nThreads];
        this.vetor = vetor;
    }

    public void letsGetSomeHellos() {
        for (int i = 0; i < nThreads; i++) {
            vThreads[i] = new Thread(new HelloFromThreads(i));
            vThreads[i].start();
        }
        vThreads[0] = new Thread(new HelloFromThreads(0, vetor, 0, 5));
        vThreads[1] = new Thread(new HelloFromThreads(0, vetor, 5, 10));

        vThreads[0].start();
        vThreads[1].start();
    }
}