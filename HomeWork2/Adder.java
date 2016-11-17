package HomeWork2;

public class Adder extends Arithmetic {
    public boolean check(Integer a, Integer b) {
        boolean c = false;
        if (a >= b) {
            c = true;
        }
        return c;
    }
}
