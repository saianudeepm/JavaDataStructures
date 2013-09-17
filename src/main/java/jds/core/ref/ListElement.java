package jds.core.ref;

/**
 * Created with IntelliJ IDEA.
 * User: sai
 * Date: 9/16/13
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListElement {

    private ListElement next;
    private Object data;

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ListElement(Object data){
        setData(data);
    }




}
