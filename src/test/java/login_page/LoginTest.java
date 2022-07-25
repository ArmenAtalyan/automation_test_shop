package login_page;

import pageObjects.LoginPage;
import org.testng.annotations.Test;

public class LoginTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void testLogin(){
        loginPage.clickAccountButton();
    }
}
