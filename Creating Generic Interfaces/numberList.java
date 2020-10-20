public class numberList<T> implements iList<T> {
    private T[] datastore;
    private int size;
    private int pos;

    public numberList(int numElements){
        pos = 0;
        size = numElements;
        datastore = (T[]) new Object[size];
    }

    public void add(T element){
        datastore[pos] = element;
        pos ++;
    }

    public T get(int n){
        return datastore[n];
    }
}
