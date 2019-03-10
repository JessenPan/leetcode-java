package org.jessenpan.leetcode;

import org.jessenpan.leetcode.S503NextGreaterElementII;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S503_NextGreaterElementIITest {

    private S503NextGreaterElementII s503NextGreaterElementII = new S503NextGreaterElementII();

    @Test
    public void test1() {
        int[] result = s503NextGreaterElementII.nextGreaterElements(new int[] { 1, 2, 1 });
        assertArrayEquals(new int[] { 2, -1, 2 }, result);
    }

}