/*The letter T is a place holder */
public class list<T>{

    private T[] datastore;
    private int size; /*store the size of the array*/
    private int pos; /*store the current position in the array, 
                        as we add or remove objects*/


    public list(int numOfElements){
        size = numOfElements; /*parse in the size of the array*/
        pos = 0;  /*as its a fresh list, the position is 0*/
        datastore = (T[]) new Object[size]; /*here we are creating a new
                                            object array, cast it to the datatype(T) when we going to instantiate later*/
    }

    public void add(T element){
        datastore[pos] = element;
        ++pos;
    }

    public String toString() {
        String elements = "";
        for (int i = 0; i < pos; i++){
            elements += datastore[i] + " ";
        }
        return elements;
    }
}