package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConflictTests {


    @Test
    public void test1 () {
        int a = 5;
        int b = 10;

        System.out.println("SUM : " + ( a + b ));

    }


    @Test
    public void test2 () {
        String message = "Welcome";
        Assert.assertTrue(message.contains("Welcome"));
    }
}
