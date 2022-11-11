package hw3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
//----------------------------------MEDVEZJA USLUGA---------------------------------------//
public class OpenLatvia {

        private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
        private final By TOP_LOCATIONS_LATVIA = By.xpath(".//div[@class = 'tl-box']");

        @Test
        public void openHomePageCheck() {
            System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
            WebDriver browser = new ChromeDriver();
            browser.manage().window().maximize();
            browser.get("http://www.discovercars.com/");

            WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

            wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
            browser.findElement(ACCEPT_COOKIES_BTN).click();

            List<WebElement> topLocations = browser.findElements(TOP_LOCATIONS_LATVIA);

            for (WebElement location : topLocations) {
                if (location.findElement(By.tagName("a")).getText().equals("Latvia")) {
                    location.findElement(By.tagName("a")).click();
                    break;
                }
            }
        }
    }
