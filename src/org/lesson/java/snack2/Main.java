package org.lesson.java.snack2;

public class Main {

    public static void main(String[] args) {
        
        ContoBancario conto = new ContoBancario(null); 

            conto.setBankBalance(1250.99);

            System.out.println(conto.getBankBalance());

        

    }

}
