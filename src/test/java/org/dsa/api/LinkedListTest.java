package org.dsa.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    LinkedList<Integer> innerList1 = new LinkedList<Integer>();  

    @Before
    public void setUp() {
        System.out.println("Starting test class...");

        innerList1.addNode(1);
        innerList1.addNode(2);
        innerList1.addNode(3);
        innerList1.addNode(2);
    
    }

    @Test
    public  void testGetListLength(){
        System.out.println("testing getListLength method...");

        assertEquals(4, innerList1.getListLength());
    }

     @Test
    public  void testGetElements(){
        System.out.println(innerList1.getElements());
        
        String expectedElements = "{[1][2][3][2]}";
        assertEquals(expectedElements,innerList1.getElements() );
    }
    
     @Test
    public  void testPopTail(){
        System.out.println("testing popTail method...");

        //FIXME: add correspoding test for this method here.
        assertTrue( true );
    }
    
}
