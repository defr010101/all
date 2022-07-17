package transformers;

import guns.*;

public class Desepticon extends Transformer {
    public Desepticon() {
        super(new FireGun());
    }

    @Override
    public void sayHello() {
        System.out.println("Hello i`m desepticon");
    }
}
