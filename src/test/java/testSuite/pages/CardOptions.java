package testSuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testSuite.session.Session;

import java.time.Duration;

public class CardOptions {
    public WebElement cardNameTextField;
    public WebElement cardNumberTextField;
    public WebElement cardMonthTextField;
    public WebElement cardYearTextField;

    public WebElement submitButton;

    //public WebElement selectRadioButton;


    public CardOptions(){
            WebDriverWait wait = new WebDriverWait(Session.getSession().getBrowser(), Duration.ofSeconds(10));

            cardNameTextField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='text'][class*='mat-input-element'][class*='mat-form-field-autofill-control'][aria-required='true'][id^='mat-input-']")));
            cardNumberTextField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='number']")));
            cardMonthTextField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[contains(@class, 'mat-input-element') and contains(@class, 'mat-form-field-autofill-control') and @aria-required='true']/option[normalize-space(text())='1']")));
            cardYearTextField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[contains(@class, 'mat-input-element') and contains(@class, 'mat-form-field-autofill-control') and @aria-required='true']/option[normalize-space(text())='2080']")));
            submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submitButton")));

            //selectRadioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-radio-button[@class='mat-radio-button mat-accent']")));
    }
}
