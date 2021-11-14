package finco.util;

import finco.Account;

public class FunctorCalculateSum implements IFunctorUtilCompute{
    double balance;
    double balance1;
    @Override
    public void compute(Account balance) {
        this.balance+=balance.getBalance();
    }
    public void computeSelection(Account balance){
        this.balance1+=balance.getBalance();
    }
    public double getBalance(){
        return balance;
    }
    public double getBalance1(){
        return balance1;
    }
}
