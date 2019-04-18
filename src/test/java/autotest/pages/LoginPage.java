package autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

    @FindBy(id = "identifierId")
    private WebElement loginField;

    @FindBy(className = "CwaK9")
    private WebElement nextButton;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(className = "CwaK9")
    private WebElement readyButton;

    public void typeLogin(){
        loginField.sendKeys("yarmish.test@gmail.com");
    }

    public void clickNext(){
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();
    }

    public void typePassword(){
        passwordField.sendKeys("wowlina12");
    }
}
