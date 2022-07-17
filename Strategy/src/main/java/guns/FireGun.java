package guns;

public class FireGun implements Gun {
    @Override
    public void shot() {
        System.out.println("Go fire - 1 second");
    }

    @Override
    public void refresh() {
        System.out.println("Refresh - 5 seconds");
    }
}
