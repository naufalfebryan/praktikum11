package org.d3ifcool.ima11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestJurnal02 {

    private static final String[] INPUT = {
            "1 8 1 1 2 6 8 10 9 3 -1",
			"4 8 3 2 8 7 -1"
	};
    private static final String[] OUTPUT = {
            "10 9 8 8 6 3 2 1 1 1",
	    "8 8 7 4 3 2"
    };

    @Test
    public void testJurnal() {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        for (int i = 0; i < INPUT.length; i++) {
            System.setIn(new ByteArrayInputStream(INPUT[i].getBytes()));
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(bos));

            Jurnal02.main(null);

            assertEquals(OUTPUT[i] + "\n", bos.toString());
        }

        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
