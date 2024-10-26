import java.util.Random;

import atividade.AddVetorMaster;

public class Main {
    private static final int TAMANHO = 90000000;
    private static final int NTHREADS = 2;

    public static void main(String[] args) {
        // Criar vetores
        double[] a = new double[TAMANHO];
        double[] b = new double[TAMANHO];
        double[] r;

        // Preencher vetores
        Random random = new Random();
        for (int i = 0; i < TAMANHO; i++) {
            a[i] = random.nextDouble() * 100;
            b[i] = random.nextDouble() * 100;
        }

        // Imprimir valores de A
        //System.out.println("Vetor A:");
        for (int i = 0; i < TAMANHO; i++) {
            //System.out.printf("%.2f\n", a[i]);
        }

        // Imprimir valores de B
        //System.out.println("Vetor B:");
        for (int i = 0; i < TAMANHO; i++) {
            //System.out.printf("%.2f\n", b[i]);
        }

        // Instanciar Master
        AddVetorMaster mrm = new AddVetorMaster(a, b, NTHREADS);

        // Executar Master
        mrm.calcVetores();
        r = mrm.getVetorR();

        // try {
        //     Thread.sleep(1500);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        // Imprimir resultado
        //System.out.printf("[R[0] " + "%.2f", r[0]);
        for(int i = 1; i < TAMANHO - 1; i++){
            //System.out.printf(" | " + "%.2f", r[i]);
        }
        //System.out.printf(" | Tamanho: " + "%.2f" + " ]\n", r[TAMANHO - 1]);
    }
}