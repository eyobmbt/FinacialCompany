package finco.util;

import finco.Account;

public interface ISelectionPredicate {
    public boolean compare(Account account,Account account1);
}
