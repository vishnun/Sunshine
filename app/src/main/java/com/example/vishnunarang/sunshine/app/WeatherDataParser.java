package com.example.vishnunarang.sunshine.app;

/**
 * Created by vishnunarang on 08/03/15.
 */

import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {

    private static final String LOG_TAG = WeatherDataParser.class.getSimpleName();

    /**
     * Given a string of the form returned by the api call:
     * http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7
     * retrieve the maximum temperature for the day indicated by dayIndex
     * (Note: 0-indexed, so 0 would refer to the first day).
     */
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        // TODO: add parsing code here
        Double maxTemp;
        JSONObject weatherJson = new JSONObject(weatherJsonStr);

        maxTemp = weatherJson.getJSONArray("list")
                .getJSONObject(dayIndex)
                .getJSONObject("temp")
                .getDouble("max");
        return maxTemp;
    }

}
