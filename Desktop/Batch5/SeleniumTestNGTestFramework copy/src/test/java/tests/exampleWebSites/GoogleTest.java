package tests.exampleWebSites;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utilities.SeleniumUtils;

public class GoogleTest {

    @Test (groups = "login")
    public void GoogleTest1() {
        new ChromeDriver().get("https://www.google.com/");

    }

    @Test
    public void GoogleTest2() {
        System.out.println(" this is Google test 2 ");
        SeleniumUtils.waitForSecond(5);

    }

    @Test (groups = {"sanity"})
    public void GoogleTest3() {
        System.out.println(" this is Google test 3 ");
        SeleniumUtils.waitForSecond(3);

    }

    @Test (groups = {"login"})
    public void login1 () {
        System.out.println("google login test 1");
    }

    @Test (groups = {"login"})
    public void login2 () {
        System.out.println("google login test 2");
    }



    @BeforeSuite
    public static void beforeSuite () {
        System.out.println(" this is before suite inside google");
    }


    @AfterSuite
    public static void afterSuite () {
        System.out.println("this is after suite inside google");
    }

}
