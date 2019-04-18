package autotest.tests;

import org.junit.Test;

import java.util.ArrayList;

public class AutomationTest extends SetUpTest {
    @Test
    public void testGoogleDocument() throws InterruptedException {
        googlePage.clickLogin();
        loginPage.typeLogin();
        loginPage.clickNext();
        loginPage.typePassword();
        loginPage.clickNext();
        googlePage.clickGoogleMenu();
        googlePage.clickGoogleDrive();
        googleDrivePage.clickCreate();
        googleDrivePage.clickGoogleDoc();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        googleDoc.typeText();
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(2000);
        driver.switchTo().window(tabs2.get(0));
        googleDrivePage.openNewDoc();
        ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        googleDoc.clickRename();
        Thread.sleep(3000);
        driver.close();
    }
}