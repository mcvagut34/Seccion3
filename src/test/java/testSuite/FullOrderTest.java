package testSuite;

import io.restassured.internal.common.assertion.Assertion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testSuite.pages.*;
import testSuite.session.Session;

public class FullOrderTest {
    @BeforeEach
    public void openBrowser() {
        Session.getSession().getBrowser().get("https://demo.owasp-juice.shop/#/");
    }

    @Test
    public void verifyRegisterSuccessfully() throws InterruptedException {
        Home home = new Home();

        home.dismissButton.click();
        home.accountButton.click();
        home.waitForLoginButton();
        home.loginButton.click();


        CreateAccount createAccount = new CreateAccount();
        createAccount.notCostumerYet.click();

        Register register = new Register();
        Thread.sleep(1000);
        register.emailTextBox.sendKeys("ejemplomv3@gmail.com");
        register.passwordTextBox.sendKeys("ejemplomv3");
        register.confirmPasswordTextBox.sendKeys("ejemplomv3");
        Thread.sleep(2000);
        register.securityQuestion.click();
        Option option = new Option();
        //Thread.sleep(4000);
        option.optionSelect.click();
        register.securityAnswer.sendKeys("Moises");
        register.registerButton.click();

        Thread.sleep(2000);
        Login login = new Login();
        login.emailTextBox.sendKeys("ejemplomv3@gmail.com");
        login.passwordTextBox.sendKeys("ejemplomv3");
        login.loginButton.click();

        home.waitForAddToBasketButton();
        Thread.sleep(2000);
        home.addToBasketButton.click();
        home.waitForCartButton();
        Thread.sleep(2000);
        home.cartButton.click();

        Checkout checkout = new Checkout();
        Thread.sleep(2000);
        checkout.checkoutButton.click();
        Thread.sleep(2000);
        Address address = new Address();
        address.addAddressButton.click();


        NewAddress newAddress = new NewAddress();
        Thread.sleep(2000);

        newAddress.countryTextField.sendKeys("Bolivia");
        newAddress.nameTextField.sendKeys("Moises");
        newAddress.mobileTextField.sendKeys("123456789");
        newAddress.zipCodeTextField.sendKeys("0000");
        newAddress.addressTextField.sendKeys("Calle 1");
        newAddress.cityTextField.sendKeys("La Paz");
        newAddress.stateTextField.sendKeys("La Paz");

        newAddress.waitForButtonSubmit();
        newAddress.submitButton.click();

        SelectAddress selectAddress = new SelectAddress();
        Thread.sleep(2000);
        selectAddress.address.click();

        selectAddress.continueButton.click();

        Thread.sleep(2000);
        DeliveryAddress deliveryAddress = new DeliveryAddress();
        deliveryAddress.radiusDelivery.click();
        deliveryAddress.continueButton.click();
        Thread.sleep(1000);
        PayOptions payOptions = new PayOptions();
        payOptions.expansionPanel.click();
        Thread.sleep(1000);
        CardOptions cardOptions = new CardOptions();
        cardOptions.cardNameTextField.sendKeys("Tarjeta de Moises");
        cardOptions.cardNumberTextField.sendKeys("1111222233334444");
        cardOptions.cardMonthTextField.click();
        cardOptions.cardYearTextField.click();
        cardOptions.submitButton.click();
        Thread.sleep(1000);
        SelectRadius selectRadius = new SelectRadius();
        //Thread.sleep(5000);
        selectRadius.radiusSelect.click();

        Thread.sleep(1000);
        payOptions.continueButton.click();
        Thread.sleep(1000);
        ValidateOrder validateOrder = new ValidateOrder();
        validateOrder.valdiateButton.click();

        OrderCompleted orderCompleted = new OrderCompleted();

        //Assert
        Assertions.assertEquals(orderCompleted.orderCompletedMessage.getText(), "Thank you for your purchase!",
                "ERROR> No se pudo realizar la compra");
        Thread.sleep(5000);
    }

    @AfterEach
    public void closeBrowser() {
        Session.getSession().closeBrowser();
    }
}
