public class LinkedList<T> {
    private Node<T> head; 
    private int listLength; 

    public LinkedList()
    {  
        head = null;
    }

    public void addNode(T value)
    {
        Node<T> newNode = new Node<T>(value); 
        if(head==null)
        {
            head = newNode; 
        }
        else
        {
            Node<T> current = head; 
            while(current.next!=null)
            {
                current = current.next; 
            }
            current.next = newNode; 
        }
        listLength += 1; 

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