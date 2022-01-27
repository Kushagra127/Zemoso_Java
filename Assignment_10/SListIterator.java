package Assignemnt_10;

public class SListIterator <E>{
    Node<E> current;
    Node<E> temp;
    Node<E> head;

    public SListIterator()
    {
//        return this.head;
    }
    public SListIterator(Node<E> arg)
    {
        this.current=arg;
        this.head=this.current;
    }
    public boolean hasNext()
    {
        return current.next != null;
    }
    public Node<E> Next(){
        this.current=this.current.next;
        return this.current;
    }
    //    insert at the end
    public void insert(E e)
    {
        temp=current;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new Node<>(e);
    }

    public void remove()
    {
        if(isEmpty())
        {
            System.out.println("Nothing to remove");
            return;
        }
        head = head.next;
        current=head;
    }

    public String currentElement(int index)
    {
        current=head;
        while(hasNext())
        {
            current=current.next;
            index--;
        }
        if(index==0) return "Element is " + current.e;
        return "Index not found";
    }
    private boolean isEmpty() {
        return head==null;
    }


}