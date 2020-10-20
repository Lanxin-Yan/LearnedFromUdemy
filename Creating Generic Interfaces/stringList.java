public class stringList<T> implements iList<T>{
    private int size;
    private int pos;
    private T[] datastore;

    public stringList(int numOfElems){
        size = numOfElems;
        pos = 0;
        datastore = (T[]) new Object[size];
    }
    
    public void add(T element){
        datastore[pos] = element;
        pos++;
    }

    public T get(int n){
        return datastore[n];
    }
    
}