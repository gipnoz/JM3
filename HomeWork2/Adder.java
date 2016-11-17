package HomeWork2;


public class Adder extends Arithmetic {
    public boolean check(Integer a, Integer b) {
        boolean c = false;
        if (a >= b) {
            c = true;
        }
        return c;
    }


    public static void main(String[] args) {
        Adder Test = new Adder();
        System.out.println(Test.check(1,2));
        System.out.println(Test.add(2,3));

    }
}

