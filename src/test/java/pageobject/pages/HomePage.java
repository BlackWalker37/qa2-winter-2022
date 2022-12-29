package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.BaseFunctions;

public class HomePage {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class='gogogo']");
    private BaseFunctions baseFunctions;

    public HomePage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }

    public void selectAirports(String from, String to) {
        baseFunctions.select(FROM, from);
        baseFunctions.select(TO, to);
        baseFunctions.click(GO_BTN);

    }
}
