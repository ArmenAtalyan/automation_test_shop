package utils;

import org.openqa.selenium.WebDriver;

public class StartDriver {
    private static WebDriver driver = null;
    private static StartDriver startDriverInstance = null;
    private static final String URL = LoadFromProp.getProperties("url");
    private static final String browser = LoadFromProp.getProperties("browser");

    private StartDriver(){
        driver = Browsers.getBrowser(browser);
        if(driver != null){
            driver.manage().window().maximize();
            driver.navigate().to(URL);
        }
    }

    public static StartDriver getInstance(){
        System.out.println("Before init driver");
        if(startDriverInstance == null){
            startDriverInstance = new StartDriver();
        }
        return startDriverInstance;
    }

    public WebDriver getDriver(){
        return driver;
    }


    public static void close(){
        driver.quit();
    }

}
