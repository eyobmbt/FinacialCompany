package finco.util;

import finco.Account;

public interface IFunctorUtilCompute {
    public void compute(Account balance);
    public void computeSelection(Account balance);
    public double getBalance();
    public double getBalance1();
}
