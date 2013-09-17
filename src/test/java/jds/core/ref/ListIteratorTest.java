package jds.core.ref;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: sai
 * Date: 9/17/13
 * Time: 10:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class ListIteratorTest {

    static LinkedList myLinkedList = new LinkedList();
    static ListIterator listIterator;
    //create 4 elements and populate with integer data
    static ListElement head  = new ListElement((Integer) 0);
    static ListElement elem1 = new ListElement((Integer) 1);
    static ListElement elem2 = new ListElement((Integer) 2);
    static ListElement elem3 = new ListElement((Integer) 3);

    @BeforeClass
    public  static void initialize(){
        //create single linked list by assigning next to each element
        myLinkedList.addElement(head);
        myLinkedList.addElement(elem1);
        myLinkedList.addElement(elem2);
        myLinkedList.addElement(elem3);
        listIterator = new ListIterator(myLinkedList);
    }

    @Test
    public void testHasNext(){
        Assert.assertTrue(listIterator.hasNext());
    }

    @Test
    public void testNext(){
        Assert.assertEquals(head,listIterator.next());
        Assert.assertEquals(elem1,listIterator.next());
        Assert.assertEquals(elem2,listIterator.next());

    }
}
