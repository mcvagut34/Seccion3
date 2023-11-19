package testSuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testSuite.session.Session;

import java.time.Duration;

public class DeliveryAddress {
    public WebElement radiusDelivery;
    public WebElement continueButton;

    public DeliveryAddress(){
        WebDriverWait wait = new WebDriverWait(Session.getSession().getBrowser(), Duration.ofSeconds(10));

        radiusDelivery = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-radio-button[@class='mat-radio-button mat-accent']")));
        continueButton = Session.getSession().getBrowser().findElement(By.xpath("//span[contains(text(),'Continue')]"));
    }
}
