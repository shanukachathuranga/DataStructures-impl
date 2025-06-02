/*
 * Array List implementation with methods for insert, read, edit, delete
 * Good for fast random data reads and updates
 */

public class ArrayListImpl<T> {
    private T[] dataList;
    private int size = 0;   // show the number of items in the list
    int capacity;   // show the maximum number of items array can currently hold

    public ArrayListImpl(int initialCapacity){
        this.capacity = initialCapacity;
        dataList = createTempList(initialCapacity);
    }

    public ArrayListImpl(){
        this(10); //default capacity = 10
    }

    @SuppressWarnings("unchecked")
    private T[] createTempList(int capacity){
        return (T[]) new Object[capacity];
    }

    private void resize(){  // resize the array
        capacity = capacity*2;
        T[] tempList = createTempList(capacity);
        System.arraycopy(dataList, 0, tempList, 0, size);
        dataList = tempList;
    }

    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index " + index + " is out of range [0.." + (size-1)+"]");
        }
    }

    public void add(T item){    // add items to the tail
        if (size == capacity) {
            resize();
        }
        dataList[size] = item;
        size ++;
    }

    public void insert(int index, T item){     // insert items at the index
        checkIndex(index);
        if(size == capacity){
            resize();
        }
        for (int i = size - 1; i >= index; i--) {
            dataList[i + 1] = dataList[i];
        }
        dataList[index] = item;
        size++;
    }

    public T get(int index) {   // return item by index
        checkIndex(index);
        return dataList[index];
    }

    public T set(int index, T item){    // set the value at the index and return the previous value
        checkIndex(index);
        T tempItem = dataList[index];
        dataList[index] = item;
        return tempItem;
    }

    public T remove(int index){ // remove item by index
        checkIndex(index);
        T tempItem = dataList[index];
        for(int i = index+1; i < size; i++){
            dataList[i-1] = dataList[i];
        }
        size--;
        return tempItem;
    }

    public int remove(T item){  // remove item and return the index of the item, if item not exists return -1
        int index = -1;
        for(int i = 0; i < size; i++){
            if(dataList[i].equals(item)){
                index = i;
                remove(i);
                break;
            }
        }
        return index;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0; // return true if size = 0 else false
    }

    public void clear(){
        dataList = createTempList(size);
        capacity = size;
        size = 0;
    }

    public String toString(){
        String msg = "[ ";
        for(int i = 0; i < size; i++){
            msg += String.valueOf(dataList[i])+", ";
        }
        return msg+"]";
    }

}
