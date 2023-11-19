package testSuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testSuite.session.Session;

import java.time.Duration;

public class SelectAddress {
    public WebElement address;
    public WebElement continueButton;



    public SelectAddress() {
        WebDriverWait wait = new WebDriverWait(Session.getSession().getBrowser(), Duration.ofSeconds(15));

        //address =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-radio-button[@id='mat-radio-42']")));
        address =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-radio-button[@class='mat-radio-button mat-accent']")));

        continueButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Continue')]")));
    }


}
