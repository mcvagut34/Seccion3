package testSuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testSuite.session.Session;

import java.time.Duration;

public class Address {
    public WebElement addAddressButton;

    public Address( ) {
        WebDriverWait wait = new WebDriverWait(Session.getSession().getBrowser(), Duration.ofSeconds(10));

        addAddressButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='mat-focus-indicator btn btn-new-address mat-button mat-raised-button mat-button-base mat-primary']")));
    }
}
