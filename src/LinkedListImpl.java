/**
 * Doubly linked list implementation with methods for add, insert, remove, read
 * Time Complexity: Reads O(n), insert O(1), delete O(1)
 * Best for frequent inserts and deletes
 */

public class LinkedListImpl<T> {
    private Node<T> head = null;
    private Node<T> tail = null;
    int size = 0; // size of the linked list

    public void add(T value){   // add value to the linked list
        Node<T> data = new Node<>(value);
        if(size == 0){
            head = data;
        }else{
            tail.setNext(data);
            data.setPrev(tail);
        }
        tail = data;
        size++;
    }

    public void insertFirs(T value){
        if(size > 0){
            Node<T> data = new Node<>(value);
            data.setNext(head);
            head.setPrev(data);
            this.head = data;
            size++;
        }else{
            add(value);
            size++;
        }
    }

    public void insertLast(T value){
        if(size > 0){
            Node<T> data = new Node<>(value);
            data.setPrev(tail);
            tail.setNext(data);
            this.tail = data;
            size++;
        }else{
            add(value);
            size++;
        }
    }

    public void insert(int index, T value){
        Node<T> data = new Node<>(value);
        if(index == 0){
            insertFirs(value);
        }else if(index == size){
            insertLast(value);
        }else{
            Node<T> node = head;
            for(int i = 1; i < index; i++){
                node = node.getNext();
            }
            node.getNext().setPrev(data);
            data.setNext(node.getNext());
            data.setPrev(node);
            node.setNext(data);
            size++;
        }
    }

    private T remove(Node<T> node){     // use to remove nodes
        Node<T> tempPrev = node.getPrev();
        Node<T> tempNext = node.getNext();
        if(tempPrev != null) tempPrev.setNext(tempNext);
        if(tempNext != null) tempNext.setPrev(tempPrev);
        size--;
        return node.getValue();
    }

    public T remove(T value){   // if the value is in the list remove value and return value, else return null
        if(size == 0) return null;

        Node<T> tempNode = head;
        if(head.equals(value)) remove(head);
        for(int i = 0; i < size; i++){
            tempNode = tempNode.getNext();
            if(tempNode.getValue().equals(value)){
                return remove(tempNode);
            }
        }
        return null;
    }

}

// Node class for the Linked List
class Node<T>{
    private T value;
    private Node<T> next = null;
    private Node<T> prev = null;

    public Node(T value){
        this.setValue(value);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }
}
