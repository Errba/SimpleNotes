package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.DirectoryPage;
import pages.LoginPage;
import utilities.SeleniumUtils;

import static utilities.Driver.getDriver;

public class HRMTest {

   LoginPage loginPage = new LoginPage();
    CommonPage commonPage = new CommonPage();

    DirectoryPage directoryPage = new DirectoryPage();
    WebDriver driver = getDriver();


    @BeforeMethod
    public void beforeMethod() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.login("Admin", "admin123");

    }


    @Test
    public void test1() {


        SeleniumUtils.click(driver, commonPage.directory);
        SeleniumUtils.click(driver, directoryPage.jobTitleDropDown);

        SeleniumUtils.waitForSecond(2);

        directoryPage.chiefFinancialManager.click();

        SeleniumUtils.click(driver, directoryPage.submit);
        Assert.assertEquals(directoryPage.financialManagerVerify.getText(), "Chief Financial Officer");

    }
}
