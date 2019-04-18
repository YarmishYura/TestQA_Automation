package autotest.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleDoc {
    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;

    public GoogleDoc(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.actions = new Actions(driver);
    }

    @FindBy(className = "kix-lineview")
    private WebElement text;

    @FindBy(id = "docs-file-menu")
    private WebElement fileMenu;

    @FindBy(className = "docs-title-input")
    private WebElement renameField;

    public void typeText(){
        actions.moveToElement(text);
        actions.click();
        actions.sendKeys("Hello world! I like to write programs on Java");
        actions.build().perform();
    }

    public void clickRename() throws InterruptedException {
        renameField.click();
        renameField.sendKeys("NewTextDocument");
        Thread.sleep(3000);
        renameField.sendKeys(Keys.ENTER);
    }
}
