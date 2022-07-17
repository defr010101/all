import guns.FireGun;
import transformers.Autobot;
import transformers.Desepticon;
import transformers.Transformer;

public class Main {
    public static void main(String[] args) {
        Transformer good1 = new Autobot();
        Transformer bad1 = new Desepticon();

        good1.sayHello();
        bad1.sayHello();

        good1.performGun();
        bad1.performGun();

        good1.setGun(new FireGun());

        good1.performGun();
        bad1.performGun();

    }
}
