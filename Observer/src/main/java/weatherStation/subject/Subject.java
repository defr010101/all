package weatherStation.subject;

import weatherStation.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers();
}
