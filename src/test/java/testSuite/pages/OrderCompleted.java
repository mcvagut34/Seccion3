package testSuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testSuite.session.Session;

public class OrderCompleted {
    public WebElement orderCompletedMessage;

    public OrderCompleted(){
        orderCompletedMessage = Session.getSession().getBrowser().findElement(By.xpath("//h1[@class='confirmation']"));
    }

}
