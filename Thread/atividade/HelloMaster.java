package Thread.atividade;

import Thread.modelo.HelloFromThreads;

public class HelloMaster {

        Thread t0 = new Thread(new HelloFromThreads(0));
        Thread t1 = new Thread(new HelloFromThreads(1));
        Thread t2 = new Thread(new HelloFromThreads(2));
        Thread t3 = new Thread(new HelloFromThreads(3));
        Thread t4 = new Thread(new HelloFromThreads(4));
        Thread t5 = new Thread(new HelloFromThreads(5));
        Thread t6 = new Thread(new HelloFromThreads(6));
        Thread t7 = new Thread(new HelloFromThreads(7));
        Thread t8 = new Thread(new HelloFromThreads(8));
        Thread t9 = new Thread(new HelloFromThreads(9));
        Thread t10 = new Thread(new HelloFromThreads(10));

    public void letsGetSomeHellos(){

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
