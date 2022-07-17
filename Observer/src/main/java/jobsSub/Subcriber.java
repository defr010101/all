package jobsSub;

public class Subcriber implements Observer {
    private String name;
    private JobSite jobSite;

    public Subcriber(String name, JobSite jobSite) {
        this.name = name;
        this.jobSite = jobSite;
        jobSite.addObserver(this);
    }

    @Override
    public void handleEvent() {
        System.out.println("Dear " + name + "\nwe have some changes in vacancies:\n" +
                jobSite.getVacancies() +
                "\n========================================================");
    }

    public void unsubscribe() {
        jobSite.removeObserver(this);
        jobSite = null;
    }

    public void subscribe(JobSite jobSite) {
        this.jobSite = jobSite;
        jobSite.addObserver(this);
    }
}
