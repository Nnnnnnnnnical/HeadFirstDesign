package module.ObservePattern.Service;

import module.ObservePattern.Subject;

import java.util.ArrayList;
import java.util.Observer;

public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(module.ObservePattern.Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(module.ObservePattern.Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i = 0;i<observers.size();i++){
            module.ObservePattern.Observer observer = (module.ObservePattern.Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
