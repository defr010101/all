package weatherStation.subject;

import weatherStation.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private int tempetarute;
    private int pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }

    public void updateData(int tempetarute, int pressure) {
        this.tempetarute = tempetarute;
        this.pressure = pressure;
        notifyObservers();
    }

    public int getTempetarute() {
        return tempetarute;
    }

    public int getPressure() {
        return pressure;
    }
}
