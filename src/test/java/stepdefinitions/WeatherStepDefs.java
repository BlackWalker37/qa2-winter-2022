package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class WeatherStepDefs {
    @Given("city ID is: {long}")
    public void set_city_id(long id) {

    }

    @When("we are requesting weather forecast")
    public void request_weather() {

    }

    @Then("coordinates are:")
    public void check_coordinates(Map<String, Double> params) {

    }

    @Then("timezone information is:")
    public void check_timezone(Map<String, String> params) {

    }

    @Then("current weather data is:")
    public void check_current_weather(Map<String, String> prams) {

    }

    @Then("current weather info is:")
    public void check_current_weather_info(Map<String, String> prams) {

    }

    @Then("minutely weather data is:")
    public void check_minutely_weather(Map<Long, String> prams) {

    }

    @Then("hourly weather data is:")
    public void check_hourly_weather(Map<String, String> prams) {

    }

    @Then("hourly weather info is:")
    public void check_hourly_weather_info(Map<String, String> prams) {

    }

    @Then("hourly probability of precipitation is:")
    public void check_hourly_probability_of_perception(Map<Double, String> prams) {

    }

    @Then("daily weather data Nr.1 is:")
    public void check_daily_weather_1(Map<String, String> prams) {

    }

    @Then("daily temperature is:")
    public void check_daily_temperature(Map<Double, String> prams) {

    }

    @Then("daily temperature feels like data is:")
    public void check_daily_temperature_feels_like(Map<String, String> prams) {

    }

    @Then("daily weather info is:")
    public void check_daily_weather_info(Map<String, String> prams) {

    }

    @Then("daily weather data Nr.2 is:")
    public void check_daily_weather_2(Map<String, String> prams) {

    }

    @Then("alert Nr. {int} received:")
    public void check_alert(int index, Map<String, String> params) {

    }

    @Then("tags for an alert Nr. {int} are:")
    public void check_tags(int index, List<String> tags) {

    }
}
