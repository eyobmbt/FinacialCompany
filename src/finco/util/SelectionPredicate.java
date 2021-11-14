package finco.util;

import finco.Account;

public class SelectionPredicate implements ISelectionPredicate{

    public boolean compare(Account account,Account account1){
        if(account.equals(account1)){
            return true;
        } else {
            return false;
        }
    }
}
