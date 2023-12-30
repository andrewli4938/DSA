package org.dsa.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LinkedListDoubleTest {

        LinkedListDouble<Integer> doublelist = new LinkedListDouble<Integer>(); 

    @Before
    public void setUpClass() {
        System.out.println("Starting test class...");
        
        doublelist.addNode(1);
        doublelist.addNode(2);
        doublelist.addNode(3);
        doublelist.addNode(4);
        doublelist.addNode(5);
    
    }

    @Test
    public  void testPrintLength(){
        System.out.println("testing printLength method...");

        assertEquals(5, doublelist.printLength());
    }

     @Test
    public  void testPrint(){
        System.out.println("testing printLength method...");

        //FIXME: add correspoding test for this method here...
        assertTrue( true );
    }
    
     @Test
    public  void testPopTail(){
        System.out.println("testing popTail method...");

        //FIXME: add correspoding test for this method here.
        assertTrue( true );
    }
    
}
