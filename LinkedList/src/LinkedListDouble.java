public class LinkedListDouble<T> {
    private Node<T> head; 
    private int listLength; 

    public LinkedListDouble()
    {
        head = null; 
    }

    public void addNode(T value)
    {
        Node<T> newNode = new Node<T>(value); 
        if(head==null)
        {
            head = newNode; 
        } else
        {
            Node<T> current = head; 
            while(current.next!=null)
            {
                current = current.next; 
            }
            newNode.prev = current;
            current.next = newNode; 
        }
        listLength += 1; 
    }

    public Node<T> popTail()
    {
        Node<T> current = head; 
        while(current.next!=null)
        {
            current = current.next;
        }
        
        Node<T> removed = current; 
        current.prev.next = null; 
        return removed; 
    }

    public void printList()
    {
        Node<T> current = head;
        while(current!=null)
        {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void printLength()
    {
        System.out.println(listLength);
    }
}
