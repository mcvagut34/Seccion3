package testSuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testSuite.session.Session;

import java.time.Duration;

public class Home {
    public WebElement accountButton;
    public WebElement loginButton;
    public WebElement dismissButton;

    public WebElement addToBasketButton;
    public WebElement cartButton;




    public Home() {

        dismissButton = Session.getSession().getBrowser().findElement(By.xpath("//a[@class='cc-btn cc-dismiss']"));
        accountButton = Session.getSession().getBrowser().findElement(By.xpath("//button[@id='navbarAccount']"));


    }

    public void waitForLoginButton() {
        WebDriverWait wait = new WebDriverWait(Session.getSession().getBrowser(), Duration.ofSeconds(10));
        WebElement loginButtonElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='navbarLoginButton']//span[contains(text(),'Login')]")));
        loginButton = loginButtonElement;
    }

    public void waitForAddToBasketButton() {
        WebDriverWait wait = new WebDriverWait(Session.getSession().getBrowser(), Duration.ofSeconds(25));
        WebElement addToBasketButtonElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-grid-tile[@class='mat-grid-tile ng-star-inserted']//button[@aria-label='Add to Basket']")));
        addToBasketButton = addToBasketButtonElement;
    }

    public void waitForCartButton() {
        WebDriverWait wait = new WebDriverWait(Session.getSession().getBrowser(), Duration.ofSeconds(25));
        WebElement cartButtonElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='mat-focus-indicator buttons mat-button mat-button-base ng-star-inserted']")));
        cartButtonElement = wait.until(ExpectedConditions.elementToBeClickable(cartButtonElement));
        cartButton = cartButtonElement;
    }


}
