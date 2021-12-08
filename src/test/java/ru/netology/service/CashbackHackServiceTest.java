package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemain() {
        CashbackHackService cash = new CashbackHackService();
        int expected = cash.remain(600);
        int actual = 400;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainBorder() {
        CashbackHackService cash = new CashbackHackService();
        int expected = cash.remain(999);
        int actual = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainEqualBorder() {
        CashbackHackService cash = new CashbackHackService();
        int expected = cash.remain(1000);
        int actual = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainZero() {
        CashbackHackService cash = new CashbackHackService();
        int expected = cash.remain(0);
        int actual = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainOne() {
        CashbackHackService cash = new CashbackHackService();
        int expected = cash.remain(1);
        int actual = 999;
        Assert.assertEquals(actual, expected);
    }
}