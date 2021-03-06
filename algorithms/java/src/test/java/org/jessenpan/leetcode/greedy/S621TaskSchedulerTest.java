package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S621TaskSchedulerTest {

    private S621TaskScheduler taskScheduler = new S621TaskScheduler();

    @Test
    public void test1() {
        int time = taskScheduler.leastInterval(new char[] { 'A', 'A', 'A', 'B', 'B', 'B' }, 2);
        Assert.assertEquals(8, time);
    }

    @Test
    public void test2() {
        int time = taskScheduler.leastInterval(new char[] { 'A','A','A','A','A','A','B','C','D','E','F','G'}, 2);
        Assert.assertEquals(16, time);
    }

}
