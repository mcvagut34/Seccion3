package testSuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testSuite.session.Session;

import java.time.Duration;

public class Checkout {
    public WebElement checkoutButton;

    public Checkout() {
        WebDriverWait wait = new WebDriverWait(Session.getSession().getBrowser(), Duration.ofSeconds(15));

        // Espera a que el botón de pago esté presente en el DOM
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='checkoutButton']")));

        // Espera a que el botón de pago esté visible y clicleable
        checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='checkoutButton']")));
    }
}
