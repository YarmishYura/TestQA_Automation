package autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleDrivePage {
    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;

    public GoogleDrivePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.actions = new Actions(driver);
    }

    @FindBy(className = "uw8t2")
    public WebElement createButton;

    @FindBy(className = "a-v-c-Ua")
    public WebElement googleDoc;

    @FindBy(xpath = "//div[text()='Новый документ']")
    public WebElement newDocument;

    public void clickCreate(){
        createButton.click();
    }

    public void clickGoogleDoc(){
        actions.moveToElement(googleDoc);
        googleDoc.click();
    }

    public void openNewDoc(){
        actions.doubleClick(newDocument).build().perform();
    }


}
