package finco.util;

public interface IBankIterator<T> {
    boolean hasNext();
    T next();
    boolean hasPrevious();
    T previous();
}
