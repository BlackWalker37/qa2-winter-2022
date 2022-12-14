package pageobject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;

public class TicketsTestsOnPages {
    private final String URL = "http://www.qaguru.lv:8089/tickets/";
    private final String FROM_AIRPORT = "RIX";
    private final String TO_AIRPORT = "SFO";

    private BaseFunctions baseFunctions = new BaseFunctions();

    @Test
    public void successfulRegistrationTest() {
        Passenger passenger = new Passenger("TestName", "TestSurname", "CCC", 2,
                1, 4, "16-05-2018");

        baseFunctions.openUrl(URL);
        HomePage homePage = new HomePage(baseFunctions);
        homePage.selectAirports(FROM_AIRPORT, TO_AIRPORT);

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunctions);
        infoPage.fillInPassengerInfo(passenger);

        Assertions.assertEquals(passenger.getFirstName(), infoPage.getPassengerName(), "Wrong name!");
        Assertions.assertEquals(FROM_AIRPORT, infoPage.getFirstFromAirport(), "Error msg!");
        Assertions.assertEquals(FROM_AIRPORT, infoPage.getSecondFromAirport(), "Error msg!");
        Assertions.assertEquals(TO_AIRPORT, infoPage.getFirstToAirport(), "Error msg!");
        Assertions.assertEquals(TO_AIRPORT, infoPage.getSecondToAirport(), "Error msg!");

        Assertions.assertTrue(infoPage.getPrice().length() > 0, "Error message");

        
    }
}
