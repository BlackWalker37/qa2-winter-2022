package hw5;

import org.junit.jupiter.api.Assertions;
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
    private final By BOOK2_BTN = By.id("book3");
    private final By SEATS = By.xpath(".//div [@class='seat']");

    private final String FROM_AIRPORT = "EZE";
    private final String TO_AIRPORT = "TNR";
    private final String PASSENGER_NAME = "Dmitrijs!";

    private final By RESERVATION_INFOR = By.xpath(".//span[@class = 'bTxt']");

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

        type(FIRST_NAME, "Dmitrijs");
        type(LAST_NAME, "Borsukovskis");
        type(DISCOUNT, "DIS25");
        type(ADULTS, "1");
        type(CHILDREN, "0");
        type(BAG, "4");
        select(FLIGHT, "11");

        browser.findElement(GET_PRICE_BTN).click();

        wait.until(ExpectedConditions.numberOfElementsToBe(RESERVATION_INFOR, 5));
        List<WebElement> reservationInformation = browser.findElements(RESERVATION_INFOR);
        String getFirstFromAirport = reservationInformation.get(0).getText();
        String getFirstToAirport = reservationInformation.get(1).getText();
        String getSecondFromAirport = reservationInformation.get(3).getText();
        String getSecondToAirport = reservationInformation.get(4).getText();
        String getPassengerName = reservationInformation.get(2).getText();
        getPassengerName.substring(0, getPassengerName.length() - 1);

        Assertions.assertEquals(FROM_AIRPORT, getFirstFromAirport, "Departure airports are not the same");
        Assertions.assertEquals(TO_AIRPORT, getFirstToAirport, "Arrival airports are not the same");
        Assertions.assertEquals(FROM_AIRPORT,getSecondFromAirport, "Departure airports are not the same");
        Assertions.assertEquals(TO_AIRPORT,getSecondToAirport, "Arrival airports are not the same");
        Assertions.assertEquals(PASSENGER_NAME, getPassengerName, "Wrong passenger name");

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

        browser.findElement(BOOK2_BTN).click();
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

  //  public void waitForElementsCountToBe(By locator, int count) {
  //      wait.until(ExpectedConditions.numberOfElementsToBe(locator, count));
  //  }

}
