package Thread.atividade;

import Thread.modelo.HelloFromThreads;

public class HelloMasterFor {

    public void letsGetSomeHellos() {
        for (int i = 0; i < 1000000; i++) {
            Thread t = new Thread(new HelloFromThreads(i % 4)); // Usando i % 4 para limitar a 4 threads
            t.start();
        }
    }
}
