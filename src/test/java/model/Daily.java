package model;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Daily {
    private long dt;
    private long sunrise;
    private long sunset;
    private long moonrise;
    private long moonset;

    @JsonProperty("moon_phase")
    private double moonPhase;

    private Temp temp;

    @JsonProperty("feels_like")
    private FeelsLike feelsLike;

    private int pressure;
    private int humidity;

    @JsonProperty("wind_speed")
    private double windSpeed;

    @JsonProperty("wind_deg")
    private int windDeg;

    @JsonProperty("wind_gust")
    private double windGust;

    private Weather weather;

    private int clouds;
    private double pop;
    private double rain;
    private double uvi;

}
