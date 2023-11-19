package testSuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testSuite.session.Session;

import java.time.Duration;

public class Login {

    public WebElement emailTextBox;
    public WebElement passwordTextBox;
    public WebElement loginButton;


    public Login() {
        WebDriverWait wait = new WebDriverWait(Session.getSession().getBrowser(), Duration.ofSeconds(20));

        emailTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        passwordTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginButton")));

    }
}
