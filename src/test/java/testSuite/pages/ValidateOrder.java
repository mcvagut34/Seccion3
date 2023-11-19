package testSuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testSuite.session.Session;

public class ValidateOrder {
    public WebElement valdiateButton;

    public ValidateOrder(){
        valdiateButton = Session.getSession().getBrowser().findElement(By.xpath("//button[@id='checkoutButton']"));
    }
}
