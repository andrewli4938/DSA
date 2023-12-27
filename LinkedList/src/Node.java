public class Node<T> {
    public Node<T> next;
    public Node<T> prev; 
    public T value;

    public Node(T value)
    {
        this.value = value; 
        this.prev = null; 
        this.next = null; 
    }
}