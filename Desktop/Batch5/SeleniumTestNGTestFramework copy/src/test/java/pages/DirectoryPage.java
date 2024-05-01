package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class DirectoryPage {

    public DirectoryPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (xpath = "//div[@class='oxd-input-group__label-wrapper']//following-sibling::div//div[@class='oxd-select-text--after']")
    public WebElement jobTitleDropDown;



    @FindBy(xpath = "//div[text()='Chief Financial Officer']")
    public WebElement chiefFinancialManager;


    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submit;


    @FindBy(xpath = "//p[text()='New York Sales Office']")
    public WebElement financialManagerVerify;

}
