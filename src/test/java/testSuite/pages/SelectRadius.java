package testSuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testSuite.session.Session;

import java.time.Duration;

public class SelectRadius {

    public WebElement radiusSelect;

    public SelectRadius(){

        radiusSelect = Session.getSession().getBrowser().findElement(By.xpath("//mat-radio-button[@class='mat-radio-button mat-accent']"));
    }
}
