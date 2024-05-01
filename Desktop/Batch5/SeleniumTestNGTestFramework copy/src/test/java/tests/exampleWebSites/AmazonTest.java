package tests.exampleWebSites;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.SeleniumUtils;

public class AmazonTest {


    @Test (groups = {"sanity"})
    public void AmazonTest1 () {
        new ChromeDriver().get("https://www.amazon.com/");
    }


    @Test
    public void AmazonTest2 () {
        System.out.println(" this is Amazon test 2 ");
        SeleniumUtils.waitForSecond(5);

    }

    @Test (groups = "login")
    public void AmazonTest3 () {
        System.out.println(" this is Amazon test 3");
        SeleniumUtils.waitForSecond(3);

    }

    @Test (groups = {"login"})
    public void login1 () {
        System.out.println("amazon login test 1");
    }

    @Test (groups = {"login"})
    public void login2 () {
        System.out.println("amazon login test 2");
    }
}
