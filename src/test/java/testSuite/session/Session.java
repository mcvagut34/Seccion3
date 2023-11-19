package testSuite.session;

import org.openqa.selenium.WebDriver;
import testSuite.browser.ChromeProxy;

public class Session {
    private static Session session = null;

    private final WebDriver browser;
    private Session() {
        browser = new ChromeProxy().create();
    }

    public static Session getSession() {
        if (session == null) {
            session = new Session();
        }
        return session;
    }

    public WebDriver getBrowser() {
        return browser;
    }

    public void closeBrowser() {
        browser.quit();
        session = null;
    }
}
