import atividade.AddVetorMaster;

public class Main {
    private static final int TAMANHO = 7;
    private static final int NTHREADS = 2;

    public static void main(String[] args) {
        // criar vetores
        double[] a = new double[TAMANHO];
        double[] b = new double[TAMANHO];
        double[] r = new double[TAMANHO];

        // para sábado: preencher o vetor com números aleatorios do tipo double

        // instanciar Master
        AddVetorMaster mrm = new AddVetorMaster(a, b, NTHREADS);

        // executar Master
        mrm.calcVetores();
        r = mrm.getVetorR();

        // pegar e imprimir resultado
        System.out.print("[ " + r[0]);
        for(int i = 1; i < TAMANHO - 1; i++){
            System.out.print(" | " + r[i]);
        }
        System.out.println(" | " + r[TAMANHO - 1] + " ]");
    }
}