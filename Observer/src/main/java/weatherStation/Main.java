package weatherStation;

import weatherStation.observer.Computer;
import weatherStation.observer.Phone;
import weatherStation.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData subject = new WeatherData();

        Phone observer1 = new Phone(subject);
        Computer observer2 = new Computer(subject);

        subject.updateData(12, 31);
        subject.updateData(12, 41);
        subject.updateData(98, 12);

    }
}
