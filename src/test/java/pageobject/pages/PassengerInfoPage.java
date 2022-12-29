package pageobject.pages;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import pageobject.BaseFunctions;
import pageobject.model.Passenger;

public class PassengerInfoPage {
    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By GET_PRICE_LINK = By.xpath(".//span[@onclick = 'setLang();']");

    private final By RESERVATION_INFO = By.xpath(".//span[@class = 'bTxt']");
    private final By RESPONSE_BLOCK = By.id("response");

    private BaseFunctions baseFunctions;

    public PassengerInfoPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }

    public void fillInPassengerInfo(Passenger passenger) {
        baseFunctions.type(FIRST_NAME, passenger.getFirstName());
        baseFunctions.type(LAST_NAME, passenger.getLastName());
        baseFunctions.type(DISCOUNT, passenger.getDiscount());
        baseFunctions.type(ADULTS, passenger.getPeopleCount());
        baseFunctions.type(CHILDREN, passenger.getChildCount());
        baseFunctions.type(BAG, passenger.getBagCount());
        baseFunctions.selectByText(FLIGHT, passenger.getDate());

        baseFunctions.click(GET_PRICE_LINK);
        baseFunctions.waitForElementsCountToBe(RESERVATION_INFO, 5);
    }

    public String getFirstFromAirport() {
        return baseFunctions.findElements(RESERVATION_INFO).get(0).getText();
    }

    public String getFirstToAirport() {return baseFunctions.findElements(RESERVATION_INFO).get(1).getText();}

    public String getSecondFromAirport() {
        return baseFunctions.findElements(RESERVATION_INFO).get(3).getText();
    }

    public String getSecondToAirport() {
        return baseFunctions.findElements(RESERVATION_INFO).get(4).getText();
    }

    public String getPassengerName() {
        String name = baseFunctions.findElements(RESERVATION_INFO).get(2).getText();
        return name.substring(0, name.length() - 1);
    }

    public String getPrice() {
        String text = baseFunctions.findElement(RESPONSE_BLOCK).getText();
        return StringUtils.substringBetween(text,"for ", " EUR");
    }
}
