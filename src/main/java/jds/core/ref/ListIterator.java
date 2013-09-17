package jds.core.ref;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: sai
 * Date: 9/17/13
 * Time: 10:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class ListIterator implements Iterator {

    public ListIterator(ListElement head){
        this.head = head;
        this.current = head;
    }

    public ListIterator(LinkedList linkedList){
        this(linkedList.getHead());
    }

    ListElement head;
    ListElement current;

    @Override
    public boolean hasNext() {
        if(current.getNext()!=null)
            return true;
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object next() {
        ListElement returnElement = current;
        if(current.getNext()!=null){
            current = current.getNext();
        }
        return returnElement;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
