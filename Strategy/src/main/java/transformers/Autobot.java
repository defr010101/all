package transformers;

import guns.*;

public class Autobot extends Transformer {
    public Autobot() {
        super(new StandartGun());
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, i`m autobot");
    }
}
