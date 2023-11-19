//package testSuite;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import testSuite.pages.*;
//import testSuite.session.Session;
//
//public class LoginTest2 {
//    @BeforeEach
//    public void openBrowser() {
//        Session.getSession().getBrowser().get("https://demo.owasp-juice.shop/#/");
//    }
//
//    @Test
//    public void verifyRegisterSuccessfully() throws InterruptedException {
//        Home home = new Home();
//
//        home.dismissButton.click();
//
//        home.accountButton.click();
//        home.waitForLoginButton();
//        home.loginButton.click();
//
//        Login login = new Login();
//
////        login.notCostumerYet.click();
////
////        Register register = new Register();
////
////        register.emailTextBox.sendKeys("mcvagut@gmail.com");
////        register.passwordTextBox.sendKeys("mcvagut12345");
////        register.confirmPasswordTextBox.sendKeys("mcvagut12345");
////
////        Thread.sleep(2000);
////        register.securityQuestion.click();
////
////
////        Option option = new Option();
////        //Thread.sleep(4000);
////        option.optionSelect.click();
////
////        register.securityAnswer.sendKeys("Moises");
////
////        register.registerButton.click();
//
//
//
//        login.emailTextBox.sendKeys("mcvagut@gmail.com");
//        login.passwordTextBox.sendKeys("mcvagut12345");
//        login.loginButton.click();
//        Thread.sleep(1000);
//
//        home.waitForAddToBasketButton();
//        home.addToBasketButton.click();
//
//        Thread.sleep(1000);
//        home.waitForCartButton();
//        home.cartButton.click();
//
//        Thread.sleep(1000);
//        Checkout checkout = new Checkout();
//        checkout.checkoutButton.click();
//
//        Thread.sleep(1000);
//        Address address = new Address();
//        address.addAddressButton.click();
//
//        Thread.sleep(1000);
//        NewAddress newAddress = new NewAddress();
//        Thread.sleep(1000);
//
//        newAddress.countryTextField.sendKeys("Bolivia");
//        newAddress.nameTextField.sendKeys("Moises");
//        newAddress.mobileTextField.sendKeys("123456789");
//        newAddress.zipCodeTextField.sendKeys("0000");
//        newAddress.addressTextField.sendKeys("Calle 1");
//        newAddress.cityTextField.sendKeys("La Paz");
//        newAddress.stateTextField.sendKeys("La Paz");
//
//        newAddress.waitForButtonSubmit();
//        newAddress.submitButton.click();
//
//        SelectAddress selectAddress = new SelectAddress();
//
//        selectAddress.address.click();
//
//        selectAddress.continueButton.click();
//
//
//        DeliveryAddress deliveryAddress = new DeliveryAddress();
//        deliveryAddress.radiusDelivery.click();
//        deliveryAddress.continueButton.click();
//
//        PayOptions payOptions = new PayOptions();
//        payOptions.expansionPanel.click();
//
//        CardOptions cardOptions = new CardOptions();
//        cardOptions.cardNameTextField.sendKeys("Tarjeta de Moises");
//        cardOptions.cardNumberTextField.sendKeys("1111222233334444");
//        cardOptions.cardMonthTextField.click();
//        cardOptions.cardYearTextField.click();
//        cardOptions.submitButton.click();
//
//        SelectRadius selectRadius = new SelectRadius();
//        Thread.sleep(5000);
//        selectRadius.radiusSelect.click();
//
//
//        payOptions.continueButton.click();
//
//        ValidateOrder validateOrder = new ValidateOrder();
//        validateOrder.valdiateButton.click();
//
//        Thread.sleep(10000);
//
//    }
//
//    @AfterEach
//    public void closeBrowser() {
//        Session.getSession().closeBrowser();
//    }
//}
