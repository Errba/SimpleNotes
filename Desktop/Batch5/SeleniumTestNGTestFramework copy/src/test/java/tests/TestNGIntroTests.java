package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGIntroTests {


    @BeforeMethod
    public static void beforeTestMethod () {
        System.out.println("This is before test in testNG class");
    }


    @AfterTest
    public static void afterTestMethod () {
        System.out.println("this is after test in testNG class");
    }






    @BeforeClass
    public static void beforeClass () {
        System.out.println("this is before class");

    }


    @BeforeMethod
    public void beforeMethod () {
        System.out.println("this is before method");
    }

    @Test
    public void test1 () {
        System.out.println("test 1");

    }


    @Test
    public void test2 () {
        System.out.println("test 2");
    }




    @Test
    public void test3 () {
        System.out.println("test 3");

    }


    @Test
    public void test4 () {
        System.out.println("test 4");

    }


}
