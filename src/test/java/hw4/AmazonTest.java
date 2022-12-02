package hw4;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AmazonTest {

    private final By ACCEPT_COOKIES_BTN = By.id("sp-cc-accept");
    private final By LIST_BESTSELLER = By.id("nav-xshop");
    private final By ACCEPT_LOCATION = By.xpath(".//input[@data-action-type = \"DISMISS\"]");

    private WebDriver browser;
    private WebDriverWait wait;

    @Test
    public void openHomePage() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://www.amazon.de/");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        browser.findElement(ACCEPT_COOKIES_BTN).click();

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_LOCATION));
        browser.findElement(ACCEPT_LOCATION).click();

        List<WebElement> listOfOptions = browser.findElements(LIST_BESTSELLER);

        for (WebElement location : listOfOptions) {
            if (location.findElement(By.tagName("a")).getText().equals("Best Sellers")) {
                location.findElement(By.tagName("a")).click();
                break;
            }
        }

    }
        }

