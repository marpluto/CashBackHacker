package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest extends TestCase {

    @Test
    public void testRemainInNormalLimit() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemainInLowerLimit() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemainCloseToBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemainInBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected,actual);
    }
}