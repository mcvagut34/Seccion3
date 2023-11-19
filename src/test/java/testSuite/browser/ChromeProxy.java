package testSuite.browser;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class ChromeProxy {
    WebDriver chrome;
    public WebDriver create(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("127.0.0.1:9292");
        proxy.setSslProxy("127.0.0.1:9292");


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--ignore-ssl-errors");

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        options.setExperimentalOption("prefs", prefs);
        options.setProxy(proxy);


        chrome = new ChromeDriver(options);
        chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        chrome.manage().window().maximize();
        chrome.get("https://demo.owasp-juice.shop/#/");

        return chrome;
    }
}
