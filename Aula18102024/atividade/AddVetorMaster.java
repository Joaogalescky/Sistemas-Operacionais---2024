package atividade;

import modelo.AddVetorThread;

public class AddVetorMaster {
    private double[] a, b, r;
    private int numThreads, tamanho;
    private Thread v_threads[];

    public AddVetorMaster(double[] a, double[] b, int numThreads) {
        this.a = a;
        this.b = b;
        this.numThreads = numThreads;
        this.tamanho = a.length;
    }

    public void calcVetores() {
        int fatia = (int) Math.floor(tamanho / numThreads);
        int extra = tamanho % numThreads;
        int inicio, fim;
        v_threads = new Thread[numThreads];
        r = new double[tamanho];

        for (int i = 0; i < numThreads; i++) {
            inicio = calcInicio(i, extra, fatia);
            fim = calcFim(i, extra, fatia, inicio);
            v_threads[i] = new Thread(new AddVetorThread(a, b, r, inicio, fim, i));
            v_threads[i].start();
        }
    }

    public double[] getVetorR() {
        return r;
    }

    private int calcInicio(int i, int extra, int fatia) {
        if (i < extra) {
            return i * (fatia + 1);
        }
        return extra * (fatia + 1) + (i - extra) * fatia;
    }

    private int calcFim(int i, int extra, int fatia, int t_inicio) {
        return (i < extra) ? t_inicio + fatia : t_inicio + fatia - 1;

        // if (i < extra) {
        //     return t_inicio + fatia;
        // } else {
        //     return t_inicio + fatia - 1;
        // }
    }

    private void joinThreads() {

    }
}