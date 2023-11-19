package testSuite.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testSuite.session.Session;

import java.time.Duration;

public class NewAddress {

    public WebElement frame;

    public WebElement countryTextField;
    public WebElement nameTextField;
    public WebElement mobileTextField;
    public WebElement zipCodeTextField;
    public WebElement addressTextField;
    public WebElement cityTextField;
    public WebElement stateTextField;
    public WebElement submitButton;

    public NewAddress(){

        WebDriverWait wait = new WebDriverWait(Session.getSession().getBrowser(), Duration.ofSeconds(2));

        // Espera a que el campo de país esté presente y visible
        countryTextField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[data-placeholder='Please provide a country.']")));
        nameTextField = Session.getSession().getBrowser().findElement(By.cssSelector("input[data-placeholder='Please provide a name.']"));
        mobileTextField = Session.getSession().getBrowser().findElement(By.cssSelector("input[data-placeholder='Please provide a mobile number.']"));
        zipCodeTextField = Session.getSession().getBrowser().findElement(By.cssSelector("input[data-placeholder='Please provide a ZIP code.']"));
        addressTextField = Session.getSession().getBrowser().findElement(By.cssSelector("textarea[data-placeholder='Please provide an address.']"));
        cityTextField = Session.getSession().getBrowser().findElement(By.cssSelector("input[data-placeholder='Please provide a city.']"));
        stateTextField = Session.getSession().getBrowser().findElement(By.cssSelector("input[data-placeholder='Please provide a state.']"));


//        nameTextField = Session.getSession().getBrowser().findElement(By.xpath("//input[@id='mat-input-2']"));
//        mobileTextField = Session.getSession().getBrowser().findElement(By.xpath("//input[@id='mat-input-3']"));
//        zipCodeTextField = Session.getSession().getBrowser().findElement(By.xpath("//input[@id='mat-input-4']"));
//        addressTextField = Session.getSession().getBrowser().findElement(By.xpath("//textarea[@id='address']"));
//        cityTextField = Session.getSession().getBrowser().findElement(By.xpath("//input[@id='mat-input-6']"));
//        stateTextField = Session.getSession().getBrowser().findElement(By.xpath("//input[@id='mat-input-7']"));

    }


    public void waitForButtonSubmit(){
        WebDriverWait wait = new WebDriverWait(Session.getSession().getBrowser(), Duration.ofSeconds(25));
        // Espera a que aparezca cualquier botón con la etiqueta 'Login' dentro del overlay
        WebElement submitButtonElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submitButton']")));
        // Una vez encontrado, asigna el elemento al loginButton
        submitButton = submitButtonElement;
    }

}
