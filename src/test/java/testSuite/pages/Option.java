package testSuite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import testSuite.session.Session;

import java.time.Duration;

public class Option {
    public WebElement optionSelect;

    public Option(){
        WebDriverWait wait = new WebDriverWait(Session.getSession().getBrowser(), Duration.ofSeconds(20));
        optionSelect = Session.getSession().getBrowser().findElement(By.xpath("//mat-option[contains(@class, 'mat-option') and contains(@class, 'ng-star-inserted') and contains(@class, 'mat-active')]"));
    }
}
