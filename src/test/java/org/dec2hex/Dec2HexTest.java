package org.dec2hex;

import static org.junit.Assert.*;

public class Dec2HexTest {

    @org.junit.Test
    public void dec2Hex() {
        assertEquals("64", Dec2Hex.dec2Hex(100));
    }
}