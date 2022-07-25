package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.StartDriver;

public class LoginPage {

    @FindBy(css = "#u_0_b_FJ")
    private WebElement accountButton;


    public void clickAccountButton(){
        System.out.println("After init driver");
        accountButton.click();
    }

}
