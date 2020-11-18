package org.d3ifcool.ima11;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTP02 {

    private static final String[] INPUT = {
            "10\n1 8 1 1 2 6 8 10 9 3",
			"6\n4 8 3 2 8 7"
    };
    private static final String[] OUTPUT = {
            "10 9 8 8 6 3 2 1 1 1",
			"8 8 7 4 3 2"
    };

    @Test
    public void testTP() {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        for (int i = 0; i < INPUT.length; i++) {
            System.setIn(new ByteArrayInputStream(INPUT[i].getBytes()));
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(bos));

            TP02.main(null);

            assertEquals(OUTPUT[i] + "\n", bos.toString());
        }

        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
