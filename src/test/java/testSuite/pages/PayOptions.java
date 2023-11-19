package testSuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testSuite.session.Session;

import java.time.Duration;

public class PayOptions {

    public WebElement expansionPanel;

    public WebElement continueButton;



    public PayOptions(){

       expansionPanel = Session.getSession().getBrowser().findElement(By.xpath("//mat-expansion-panel-header[.//mat-panel-title[contains(text(),'Add new card')]]"));
         continueButton = Session.getSession().getBrowser().findElement(By.xpath("//span[contains(text(),'Continue')]"));
    }

}
