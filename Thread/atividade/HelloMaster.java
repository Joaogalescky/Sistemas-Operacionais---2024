package Thread.atividade;

import Thread.modelo.HelloFromThreads;

public class HelloMaster {
    
    public void letsGetSomeHellos(){
        Thread t0 = new Thread(new HelloFromThreads(0));
        Thread t1 = new Thread(new HelloFromThreads(1));
        Thread t2 = new Thread(new HelloFromThreads(2));
        Thread t3 = new Thread(new HelloFromThreads(3));

        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
