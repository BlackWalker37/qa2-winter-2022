package hw5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WorkingWithTicketsHW {

    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");

    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class='gogogo']");
    private final By GET_PRICE_BTN = By.xpath("//span [text() ='Get Price']");
    private final By BOOK_BTN = By.id("book2");
    private final By SEATS = By.xpath(".//div [@class='seat']");

    private WebDriver browser;
    private WebDriverWait wait;

    @Test
    public void reservationCheckHomeWork() {

        String seatsToSelect = "28";

        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.qaguru.lv:8089/tickets/");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        Select airportFrom = new Select(browser.findElement(FROM));
        airportFrom.selectByValue("EZE");

        Select airportTo = new Select(browser.findElement(TO));
        airportTo.selectByValue("TNR");

        browser.findElement(GO_BTN).click();

        browser.findElement(GET_PRICE_BTN).click();

        browser.findElement(BOOK_BTN).click();

        List<WebElement> seat = browser.findElements(SEATS);
//        seat.get(26).click();

        for (WebElement we: seat) {
            if (we.getText().equals(seatsToSelect)) {
                wait.until(ExpectedConditions.elementToBeClickable(we));
            we.click();
            break;
            }
        }

        type(FIRST_NAME, "Dmitrijs");
        type(LAST_NAME, "Borsukovskis");
        type(DISCOUNT, "DIS25");
        type(ADULTS, "1");
        type(CHILDREN, "0");
        type(BAG, "4");
        select(FLIGHT, "11");

    }

    private void select(By locator, String value) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByValue(value);

    }

    private void type(By locator, String text) {
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        input.clear();
        input.sendKeys(text);
    }

}
