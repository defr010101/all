package guns;

public class StandartGun implements Gun {
    private int bulletsCount;

    public StandartGun() {
        bulletsCount = 10;
    }

    @Override
    public void shot() {
        System.out.println("Shot with solo bullet");
        bulletsCount--;
    }

    @Override
    public void refresh() {
        System.out.println("Refresh bullets");
        bulletsCount = 10;
    }
}
