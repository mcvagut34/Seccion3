package testSuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testSuite.session.Session;

public class CreateAccount {

    public WebElement notCostumerYet;

    public CreateAccount(){
        notCostumerYet = Session.getSession().getBrowser().findElement(By.xpath("//a[@class='primary-link']"));
    }
}
