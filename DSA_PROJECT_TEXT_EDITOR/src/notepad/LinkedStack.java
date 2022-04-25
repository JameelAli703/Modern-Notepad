package notepad;

import java.util.NoSuchElementException;
import java.util.Stack;

public class LinkedStack extends Stack {
    private static class Node{
        Object object;
        Node next;
        Node(Object o){
            object=o;
        }
        Node(Object obj, Node next){
            object=obj;
            this.next=next;}}
    Node top;
    int size;
    @Override
    public Object peek() {
        if(size==0) {throw new NoSuchElementException();}
        return top.object;
    }

    @Override
    public Object push(Object obj) {
        top= new Node(obj, top);
        ++size;
        return obj;
    }

    @Override
    public Object pop() {
        if(size==0) throw new NoSuchElementException();
        Object oldtop=top.object;
        top=top.next;
        --size;
        return oldtop;
    }

    @Override
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

}