package finco.util;

public class BankIterator<T> implements IBankIterator<T> {
    BankCollectionIterator<T> listOfItems;
   public int index;
    BankIterator(BankCollectionIterator listOfItems){
        index=0;
        this.listOfItems=listOfItems;
    }


    @Override
    public boolean hasNext() {
        if(index<listOfItems.size())
             return true;
        else
            return false;
    }

    @Override
    public T next() {
        if(hasNext()){
            return (T) listOfItems.get(index++);
        }
        return null;
    }

    @Override
    public boolean hasPrevious() {
        if(index>0 ){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public T previous() {
        if(hasPrevious()){
            return (T) listOfItems.get(--index);
        }
        else {
            return null;
        }
    }
}
