package org.example;

import static org.junit.jupiter.api.Assertions.*;

class qqTest {

    @org.junit.jupiter.api.Test
    void temp() {
        qq qq = new qq();
        String s = qq.temp();
        assertEquals("testme", s);
    }
}