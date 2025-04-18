package org.lesson.java.snack2;

import java.math.BigDecimal;
import java.util.Random;

public class ContoBancario {

    private int accountNumber; 
    private BigDecimal bankBalance;
    private String message= "Il saldo del conto numero:";

    public ContoBancario() {
        Random rand = new Random();
        this.accountNumber = rand.nextInt(99999);
        this.bankBalance = new BigDecimal(0);
    }

    private void setBankBalance(BigDecimal bankBalance){

        this.bankBalance = bankBalance;

    }

    public void deposit(BigDecimal depositAmount){

        if(depositAmount.compareTo(new BigDecimal(0)) == 1) {
            this.bankBalance = this.bankBalance.add(depositAmount);
        }
    }

    public Boolean retire(BigDecimal retireAmount){
        if(retireAmount.compareTo(new BigDecimal(0)) == 1 && bankBalance.compareTo(retireAmount) == 1){
            this.bankBalance = this.bankBalance.subtract(retireAmount);
            return true;
        }
        return false;
    }

    public String getBankBalance(){
        return  message + " " + accountNumber + " e' "+ bankBalance;
    }

}
