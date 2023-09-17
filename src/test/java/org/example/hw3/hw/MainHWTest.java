package org.example.hw3.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    @Test
    void evenOddNumberTrue() {
        assertTrue(MainHW.evenOddNumber(44));
    }

    @Test
    void evenOddNumberFalse() {
        assertFalse(MainHW.evenOddNumber(13));
    }

    @Test
    void numberInIntervalTrue() {
        assertTrue(MainHW.numberInInterval(25));
    }

    @Test
    void numberInIntervalFalse() {
        assertFalse(MainHW.numberInInterval(101));
    }
}