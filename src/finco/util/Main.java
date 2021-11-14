package finco.util;

import bank.CreateBankCustomerAccount;
import finco.AbstractFactoryCreateCustomerAccount;
import finco.Account;
import finco.CreateCustomerAccount;
import finco.IAccount;

public class Main {
    public static void main(String[] args){
        BankCollectionIterator<IAccount> bank=new BankCollectionIterator<>();

        AbstractFactoryCreateCustomerAccount account=new CreateCustomerAccount();
       Account eyob= account.createAccount("de");
        Account daniel= account.createAccount("de");
        Account adane= account.createAccount("de");
         eyob.setAccountBalance("1111", 100);
        bank.add(eyob);
        bank.add(eyob);
        adane.setAccountBalance("2222",50);
        bank.add(adane);
        daniel.setAccountBalance("3333",50);
        bank.add(daniel);

        IBankIterator it=bank.getIterator();
        IFunctorUtilCompute ifunctor=new FunctorCalculateSum();
        ISelectionPredicate selection=new SelectionPredicate();

        bank.doCompute(ifunctor);
        System.out.println(ifunctor.getBalance());
        bank.doCompute(ifunctor,selection,eyob);

        System.out.println(ifunctor.getBalance1());

    }
}
