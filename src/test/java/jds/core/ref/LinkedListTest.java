package jds.core.ref;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: sai
 * Date: 9/17/13
 * Time: 10:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedListTest {
    //create 4 elements and populate with integer data
    static LinkedList myLinkedList;
    //create 4 elements and populate with integer data
    static ListElement head  = new ListElement((Integer) 0);
    static ListElement elem1 = new ListElement((Integer) 1);
    static ListElement elem2 = new ListElement((Integer) 2);
    static ListElement elem3 = new ListElement((Integer) 3);
    @BeforeClass
    public  static void initialize(){
        //create single linked list by assigning next to each element
        myLinkedList = new LinkedList();
        myLinkedList.addElement(head);
        myLinkedList.addElement(elem1);
        myLinkedList.addElement(elem2);
        myLinkedList.addElement(elem3);
    }
    @Test
    public void testSize(){
        Assert.assertEquals(4, myLinkedList.size());
    }

    @Test
    public void testFind(){
        ListElement foundElement = myLinkedList.find((Integer)3);
        Assert.assertEquals(elem3,foundElement);
    }
    @Test
    public void testGetLastElement(){
        Assert.assertEquals(elem3,myLinkedList.getLastElement());
    }

    @Test
    public void testGetLast(){
        Assert.assertEquals(elem3.getData(),myLinkedList.getLast());
    }
    @Test
    public void testDeleteElement() {

        myLinkedList.deleteElement(elem3);
        Assert.assertEquals("failed to delete element#",3, myLinkedList.size());

        myLinkedList.deleteElement(head);
        Assert.assertEquals("head deletion failed#",1,head.getData());
    }

    @Test
    public void testAddElement(){
        ListElement elem4 = new ListElement((Integer) 4);
        int oldSize = myLinkedList.size();
        myLinkedList.addElement(elem4);
        int newSize = myLinkedList.size();
        Assert.assertEquals(elem4,myLinkedList.getLastElement());
        Assert.assertEquals(oldSize+1, newSize);

    }

    @Test
    public void testAdd(){
        Object testData = (Integer)5;
        myLinkedList.add(testData);
        Assert.assertNotNull(myLinkedList.find(testData));
    }

    @Test
    public void testDeleteList(){
        myLinkedList.deleteList();
        Assert.assertEquals(null,myLinkedList.getHead());
    }

}
