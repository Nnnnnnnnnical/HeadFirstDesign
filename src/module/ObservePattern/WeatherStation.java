package module.ObservePattern;

import module.ObservePattern.Service.CurrentConditionsDisplay;
import module.ObservePattern.Service.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData); //添加到观察者队列

        weatherData.setMeasurements(80, 65, 30.4f);
        //ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(10, 69, 0.4f);

      /*StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(10, 20, 30);
        weatherData.setMeasurements(82, 70, 31.4f);*/

    }
}
