package Thread.modelo; 

public class HelloFromThreads implements Runnable{
    int tId;

    public HelloFromThreads(int tId, int[] vetor, int i, int j) {
        this.tId = tId;
    }

    public HelloFromThreads(int i) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void run() {
        System.out.println("Olá da thread " + tId);
        // TODO Auto-generated method stub
    }
    
}
