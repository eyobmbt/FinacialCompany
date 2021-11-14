package finco.util;

import finco.Account;
import finco.IAccount;

import java.util.ArrayList;


public class BankCollectionIterator<E> extends ArrayList {

    BankIterator getIterator() {
        return new BankIterator(this);
    }

    public void doCompute(IFunctorUtilCompute computeFunctor){
        BankIterator iterator=getIterator();
        while (iterator.hasNext()){
            computeFunctor.compute((Account) iterator.next());
        }
    }

    public void doCompute(IFunctorUtilCompute computeFunctor,ISelectionPredicate predicate,
                          Account thisAccount){
        BankIterator iterator=getIterator();
        Account account;
        while(iterator.hasNext()){
            account= (Account) iterator.next();
            if(predicate.compare(account,thisAccount)){
                computeFunctor.computeSelection(account);
            }
        }
    }


}
