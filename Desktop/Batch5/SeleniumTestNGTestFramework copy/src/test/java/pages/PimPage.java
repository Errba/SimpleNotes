package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.SeleniumUtils;

public class PimPage {

    public PimPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "button[class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addButton;

    @FindBy (css = "firstName")
    public WebElement firstName;


    @FindBy (css = "lastName")
    public WebElement lastName;

    @FindBy (xpath = "//label[@class='oxd-label']//following::input[@class='oxd-input oxd-input--active']")
    public WebElement employeeID;


    @FindBy (css = "button[type= submit] ")
    public WebElement saveButton;


    @FindBy (xpath = "//h6[@class='oxd-text oxd-text--h6 --strong']")
     public WebElement fullName;

    Faker faker = new Faker(); // faker is a library that gives us random numbers

    public String fName = faker.name().firstName();
    public String lName = faker.name().lastName();
    public String empID = faker.number().digits(8);




    // this method adds employee with randomly generated data
    public void addEmployee () {

        addButton.click();
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);

        SeleniumUtils.clearAndSendKeys(Driver.getDriver(), employeeID, empID);

        saveButton.click();



    }
}
