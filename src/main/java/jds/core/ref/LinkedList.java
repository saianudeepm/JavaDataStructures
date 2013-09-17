package jds.core.ref;

/**
 * Created with IntelliJ IDEA.
 * User: sai
 * Date: 9/17/13
 * Time: 9:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedList {
    private ListElement head;

    public LinkedList(){
        head = null;
    }

    public ListElement getHead(){
        return this.head;
    }

    /*find the element given head and its data value*/
    public ListElement find(Object data){
        ListElement tempElement = head;
        while(tempElement.getData() != data){
            tempElement = tempElement.getNext();
        }
        return tempElement;
    }

    /*add element to the list*/
    public Boolean addElement(ListElement addElement){
        if(head==null){
            head = addElement;
            return true;
        }
        ListElement temp = head;
        while(temp.getNext() != null){
            temp= temp.getNext();
        }
        temp.setNext(addElement);
        return true;
    }

    public Boolean add(Object data){
        ListElement newElement = new ListElement(data);
        this.addElement(newElement);
        return true;
    }

    /*delete an element from list given head and deleteElement*/
    public Boolean deleteElement(ListElement deleteElement){
        ListElement element  = head;
        if(deleteElement == head){
            head.setData(head.getNext().getData());
            head.setNext(head.getNext().getNext());
            return true;
        }

        while(element!=null){
            if(element.getNext() == deleteElement){
                element.setNext(element.getNext().getNext());
                return true;
            }
            element = element.getNext();
        }
        return false;
    }

    public Boolean delete(Object deleteData){
        ListElement element  = head;
        if(deleteData == head.getData()){
            head.setData(head.getNext().getData());
            head.setNext(head.getNext().getNext());
            return true;
        }
        while(element!=null){
            if(element.getNext().getData() == deleteData){
                element.setNext(element.getNext().getNext());
                return true;
            }
            element = element.getNext();
        }
        return false;
    }

    /*return the length of the list*/
    public int size(){
        int len=0;
        ListElement ptrElement = head;
        while(ptrElement!=null){
            len++;
            ptrElement = ptrElement.getNext();
        }
        return len;
    }

    public  Boolean deleteList(){
        ListElement deleteMe = head;
        while(deleteMe != null){
            ListElement next = head.getNext();
            deleteMe.setNext(null);
            //deleteMe.setData(null);
            deleteMe = next;
        }
        head = null;
        return true;
    }

    public ListElement getLastElement(){
        ListElement lastEle = head;
        while(lastEle.getNext()!=null)
            lastEle = lastEle.getNext();
        return lastEle;
    }
    public Object getLast(){
        return getLastElement().getData();
    }
}

