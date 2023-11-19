package testSuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testSuite.session.Session;

import java.time.Duration;

public class Register {
    public WebElement emailTextBox;
    public WebElement passwordTextBox;
    public WebElement confirmPasswordTextBox;

    public WebElement securityQuestion;

    public WebElement option;

    public WebElement securityAnswer;

    public WebElement registerButton;

    public Register(){
        WebDriverWait wait = new WebDriverWait(Session.getSession().getBrowser(), Duration.ofSeconds(20));

        emailTextBox = Session.getSession().getBrowser().findElement(By.id("emailControl"));
        passwordTextBox = Session.getSession().getBrowser().findElement(By.id("passwordControl"));
        confirmPasswordTextBox = Session.getSession().getBrowser().findElement(By.id("repeatPasswordControl"));
        securityQuestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("mat-select[name='securityQuestion']")));
        //option = Session.getSession().getBrowser().findElement(By.xpath("//mat-option[contains(@class, 'mat-option') and contains(@class, 'ng-star-inserted') and contains(@class, 'mat-active')]"));
        securityAnswer = Session.getSession().getBrowser().findElement(By.id("securityAnswerControl"));

        registerButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='registerButton']")));
    }

}
