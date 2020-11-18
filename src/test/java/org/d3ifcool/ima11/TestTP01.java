package org.d3ifcool.ima11;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestTP01 {

    private static final String[] INPUT = {
            "3\nDira\nRadi\nIdar"
    };
    

    @Test
    public void testTP() {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        System.setIn(new ByteArrayInputStream(INPUT[0].getBytes()));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        TP01.main(null);

        String test = bos.toString();

        assertTrue(test.equals("Dira") || test.equals("Radi") || test.equals("Idar"));
        

        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
