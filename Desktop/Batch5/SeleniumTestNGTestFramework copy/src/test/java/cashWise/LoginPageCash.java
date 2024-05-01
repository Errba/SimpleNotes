package cashWise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPageCash {

    public void LoginPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root css-1wgjx4y']")
    public WebElement signIn;






}
