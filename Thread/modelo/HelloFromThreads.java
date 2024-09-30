package Thread.modelo; 

public class HelloFromThreads implements Runnable{
    int tId;

    public HelloFromThreads(int tId) {
        this.tId = tId;
    }

    @Override
    public void run() {
        System.out.println("Olá da thread " + tId);
        // TODO Auto-generated method stub
    }
    
}
