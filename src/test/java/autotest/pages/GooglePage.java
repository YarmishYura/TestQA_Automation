package autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage{
    public WebDriver driver;
    public WebDriverWait wait;

    public GooglePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

    @FindBy(id = "gb_70")
    private WebElement loginButton;

    @FindBy(className = "gb_gf")
    private WebElement googleMenu;

    @FindBy(id = "gb49")
    public WebElement googleDrive;

    public void clickLogin(){
        loginButton.click();
    }

    public void clickGoogleMenu(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gb_gf")));
        googleMenu.click();
    }

    public void clickGoogleDrive(){
        googleDrive.click();
    }
}
