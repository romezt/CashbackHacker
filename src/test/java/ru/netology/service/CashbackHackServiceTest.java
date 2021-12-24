package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

        @Test
        public void shouldRemain() {
            CashbackHackService cash = new CashbackHackService();
            int actual = cash.remain(600);
            int expected = 400;
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void shouldRemainBorder() {
            CashbackHackService cash = new CashbackHackService();
            int actual = cash.remain(999);
            int expected = 1;
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void shouldRemainEqualBorder() {
            CashbackHackService cash = new CashbackHackService();
            int actual = cash.remain(1000);
            int expected = 0;
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void shouldRemainZero() {
            CashbackHackService cash = new CashbackHackService();
            int actual = cash.remain(0);
            int expected = 1000;
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void shouldRemainOne() {
            CashbackHackService cash = new CashbackHackService();
            int actual = cash.remain(1);
            int expected = 999;
            Assert.assertEquals(expected, actual);
        }
    }