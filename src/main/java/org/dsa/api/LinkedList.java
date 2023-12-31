package org.dsa.api;

import java.util.List;
import java.util.ArrayList;

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
        } else
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

    public Node<T> popTail()
    {
        Node<T> current = head; 
        Node<T> prev = null; 
        while(current.next!=null)
        {
            prev = current; 
            current = current.next;
        }
        
        Node<T> removed = current; 
        prev.next = null; 
        listLength -= 1; 
        return removed; 
    }

    /**
     * This class should provide a travsing method that return the object type T. 
     * I am just hacking it here via java collections for the simplicity 
     * @return
     */
     public List<T> getElementObject(){
        ArrayList<T> list = new ArrayList<T>();
        Node<T> current = head; 
        while(current!=null)
        {
            list.add(current.value);
            current = current.next; 
        }
        return list;
    }


    public String getElements()
    {
        StringBuffer sb = new StringBuffer("{");
        Node<T> current = head; 
        while(current!=null)
        {
            sb.append("[").append(current.value).append("]");
            current = current.next; 
        }
        sb.append("}");
        return sb.toString();
    }

    public int getListLength()
    {
        System.out.println(listLength); 
        return listLength;
    }


//     private void printList(){ //visual testing
//         System.out.println(getListString());

//     }
}
