package tests.exampleWebSites;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.SeleniumUtils;

public class EtsyTest {

    @Test(groups = {"sanity"})
    public void EtsyTest1() {
        new ChromeDriver().get("https://www.etsy.com/");
    }


    @Test (groups = {"login"})
    public void login1 () {
        System.out.println("etsy login test 1");
    }


    @Test (groups = {"login"})
    public void login2 () {
        System.out.println("etsy login test 2");
    }

}


