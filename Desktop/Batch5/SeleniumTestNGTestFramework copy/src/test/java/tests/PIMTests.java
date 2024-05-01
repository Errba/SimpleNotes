package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.LoginPage;
import pages.PimPage;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.time.Duration;

public class PIMTests {



    LoginPage loginPage = new LoginPage();
    PimPage pimPage = new PimPage();
    CommonPage commonPage = new CommonPage();
    WebDriver driver = Driver.getDriver();




    @BeforeMethod
    public void login () {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.login("Admin", "admin123");

    }

    @Test
    public void verifyAdminCreateEmployee () {

        commonPage.pimTab.click();
        pimPage.addEmployee();
        String expectedName = pimPage.fName + " " + pimPage.lastName;


        SeleniumUtils.verifyTextInElement(driver, 20, pimPage.fullName, expectedName);

        commonPage.pimTab.click();

        WebElement empIdInTable = driver.findElement(By.xpath("//div[text()='" + pimPage.empID + "']"));

        WebElement firstNameInTable =
                driver.findElement(By.xpath("//div[text()='" + pimPage.empID + "']/../following-sibling::div[1]"));

        WebElement lastNameInTable =
                driver.findElement(By.xpath("//div[text()='" + pimPage.empID + "']/../following-sibling::div[2]"));



        SeleniumUtils.verifyTextInElement(driver, 10, empIdInTable, pimPage.empID);
        SeleniumUtils.verifyTextInElement(driver, 10, firstNameInTable, pimPage.fName);
        SeleniumUtils.verifyTextInElement(driver, 10, lastNameInTable, pimPage.lName);





    }
}
