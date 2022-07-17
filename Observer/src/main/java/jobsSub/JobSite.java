package jobsSub;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observed {
    private List<Observer> subscribers;
    private List<String> vacancies;

    public JobSite() {
        subscribers = new ArrayList<>();
        vacancies = new ArrayList<>();
    }

    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent();
        }
    }

    public List<String> getVacancies() {
        return vacancies;
    }
}
