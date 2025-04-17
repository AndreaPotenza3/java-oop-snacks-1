package org.lesson.java.snack2;

import java.util.Random;

public class ContoBancario {

    private int accountNumber; 
    private Double bankBalance;
    private String message= "Il saldo del conto numero:";

    public ContoBancario(Double bankBalance) {
        Random rand = new Random();
        this.accountNumber = rand.nextInt(99999);
        this.bankBalance = null;
    }

    public void setBankBalance(Double bankBalance){

        this.bankBalance = bankBalance;

    }

    public String getBankBalance(){
        return  message + " " + accountNumber + " e' "+ bankBalance;
    }

}
