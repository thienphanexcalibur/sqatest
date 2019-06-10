/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sqa.Sqa;

/**
 *
 * @author justj
 */
public class testsqa {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    public testsqa() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void test1() {
        int a[] = {1, 2, 3};
        int n = 3;
        int expectedOutput = 2;
        int input = new Sqa().sum(a,n);
        Assert.assertEquals(input, expectedOutput);
    }

    @Test
    public void test2() {
        int a[] = {-1, -3, -4};
        int n = 3;
        String expectedOutput = "There is no positive number";
        new Sqa().sum(a, n);
        Assert.assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void test3() {
        int a[] = {0, 0, 0};
        int n = 3;
        int expectedOutput = 0;
        int input = new Sqa().sum(a, n);
        Assert.assertEquals(input, expectedOutput);
    }

    @Test
    public void test4() {
        int a[] = {-3, 4, 2};
        int n = 3;
        int expectedOutput = 6;
        int input = new Sqa().sum(a, n);
        Assert.assertEquals(input, expectedOutput);
    }

}
