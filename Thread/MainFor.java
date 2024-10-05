package Thread;

import Thread.atividade.HelloMasterFor;

public class MainFor {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        HelloMasterFor hm = new HelloMasterFor(2, vetor);
        hm.letsGetSomeHellos();

        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
