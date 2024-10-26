package modelo;

public class AddVetorThread implements Runnable {
    private double[] a, b, r;
    private int inicio, fim, tId;

    public AddVetorThread(double[] a, double[] b, double[] r, int inicio, int fim, int tId){
        this.a = a;
        this.b = b;
        this.r = r;
        this.inicio = inicio;
        this.fim = fim;
        this.tId = tId; //ThreadId
    }

    @Override
    public void run() {
        for(int i = inicio; i <= fim; i++) {
            r[i] = a[i] * b[i]; 
        }
    }
}
