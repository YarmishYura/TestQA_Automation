package autotest.tests;

import autotest.pages.GoogleDoc;
import autotest.pages.GoogleDrivePage;
import autotest.pages.GooglePage;
import autotest.pages.LoginPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class SetUpTest{
    public static WebDriver driver;
    public static GooglePage googlePage;
    public static LoginPage loginPage;
    public static GoogleDrivePage googleDrivePage;
    public static GoogleDoc googleDoc;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        googlePage = new GooglePage(driver);
        loginPage = new LoginPage(driver);
        googleDrivePage = new GoogleDrivePage(driver);
        googleDoc = new GoogleDoc(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
