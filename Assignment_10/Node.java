package Assignemnt_10;

public class Node<E> {
    E e;
    Node<E> next;

    Node(){
        this.e=null;
        this.next=null;
    }
    Node(E e){
        this.e=e;
        this.next=null;
    }
    Node(E e, Node<E> next){
        this.e=e;
        this.next=next;
    }

    @Override
    public String toString() {
        if(e==null) return "null";
        return "Node{" +
                "e=" + e +
                ", next=" + next +
                '}';
    }
}
