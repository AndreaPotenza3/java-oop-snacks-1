package org.lesson.java.snack2;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        
        ContoBancario conto = new ContoBancario(); 

            conto.deposit(new BigDecimal(1250));
            conto.retire(new BigDecimal(800));


            System.out.println(conto.getBankBalance());

        

    }

}
