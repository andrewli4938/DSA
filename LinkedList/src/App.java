public class App {
    public static void main(String[] args) {
        // LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>(); 
        // LinkedList<Integer> innerList1 = new LinkedList<Integer>(); 
        // LinkedList<Integer> innerList2 = new LinkedList<Integer>(); 
        
        // innerList1.addNode(1);
        // innerList1.addNode(2);
        // innerList1.addNode(3);
        // innerList1.addNode(2);
        // innerList1.printList();


        // innerList2.addNode(1);
        // innerList2.addNode(2);
        // innerList2.addNode(3);
        // innerList2.addNode(2);
        
        // list.addNode(innerList2);
        // list.addNode(innerList1);

        LinkedListDouble<Integer> doublelist = new LinkedListDouble<Integer>(); 
        doublelist.addNode(1);
        doublelist.addNode(2);
        doublelist.addNode(3);
        doublelist.addNode(4);
        doublelist.addNode(5);
        doublelist.popTail(); 

        doublelist.printList();
    }
}
