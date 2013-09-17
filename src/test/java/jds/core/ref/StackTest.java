package jds.core.ref;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: sai
 * Date: 9/17/13
 * Time: 1:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class StackTest {

    static Stack myStack;

    @BeforeClass
    public static void init(){
        myStack = new Stack();
    }

    @Test
    public void testPush(){
       myStack.push(1);
       myStack.push(2);
       myStack.push(3);
       myStack.push(4);
       Assert.assertEquals(4,myStack.getStackTop());
    }

    @Test
    public void testPop(){
        Assert.assertEquals(4,myStack.pop());
        Assert.assertEquals(3,myStack.getStackTop());
    }

}
