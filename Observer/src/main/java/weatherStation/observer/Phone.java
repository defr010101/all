package weatherStation.observer;

import weatherStation.subject.Subject;
import weatherStation.subject.WeatherData;

public class Phone implements Observer, DisplayMonitor {
    private WeatherData subject;
    private int temperature;
    private int pressure;

    public Phone(WeatherData subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = subject.getTempetarute();
        this.pressure = subject.getPressure();
        display();
    }

    public void unsubscribe() {
        subject.deleteObserver(this);
    }

    @Override
    public void display() {
        System.out.println("observer.Phone: {temperature: " + temperature +
                ", pressure: " + pressure + "}");
    }
}
