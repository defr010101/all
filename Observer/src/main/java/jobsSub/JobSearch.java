package jobsSub;

public class JobSearch {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();

        jobSite.addVacancy("Junior Java developer");
        jobSite.addVacancy("Junior Python developer");

        Subcriber subcriber1 = new Subcriber("Mikhail", jobSite);
        Subcriber subcriber2 = new Subcriber("Ivan", jobSite);

        jobSite.addVacancy("Middle Scala developer");

        subcriber1.unsubscribe();

        jobSite.removeVacancy("Middle Scala developer");
    }
}
