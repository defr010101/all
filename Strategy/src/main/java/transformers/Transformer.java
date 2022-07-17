package transformers;

import guns.Gun;

public abstract class Transformer {
    private Gun gun;

    public Transformer(Gun gun) {
        this.gun = gun;
    }

    public abstract void sayHello();

    public void performGun() {
        gun.shot();
    }

    public void performRefresh() {
        gun.refresh();
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }
}
