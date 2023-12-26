public class App {
    public static void main(String[] args) {
        LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>(); 
        LinkedList<Integer> innerList1 = new LinkedList<Integer>(); 
        LinkedList<Integer> innerList2 = new LinkedList<Integer>(); 
        
        innerList1.addNode(1);
        innerList1.addNode(2);
        innerList1.addNode(3);
        innerList1.addNode(2);

        innerList2.addNode(1);
        innerList2.addNode(2);
        innerList2.addNode(3);
        innerList2.addNode(2);
        
        list.addNode(innerList2);
        list.addNode(innerList1);
        list.printList();

    }
}
