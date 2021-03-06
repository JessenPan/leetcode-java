package org.jessenpan.leetcode.stack;

import org.jessenpan.leetcode.stack.S155MinStack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S155MinStackTest {

    private S155MinStack.MinStack minStack = new S155MinStack.MinStack();

    @Test
    public void test1() {

        minStack.push(7);
        minStack.push(2);
        assertEquals(2, minStack.top());
        assertEquals(2, minStack.getMin());
        minStack.push(1);
        assertEquals(1, minStack.getMin());
        minStack.pop();
        assertEquals(2, minStack.getMin());
        minStack.push(5);
        assertEquals(5, minStack.top());
        assertEquals(2, minStack.getMin());
    }

    @Test
    public void test2() {

        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        assertEquals(0, minStack.getMin());
        minStack.pop();
        assertEquals(0, minStack.getMin());
    }

}
