package HomeWork1;


public class Bird {
    public static void main(String[] args) {
        BirdJob bird = new BirdJob();
        bird.sing();
        bird.fly();
        bird.walk();
        bird.whoAmI();

    }
}
class BirdJob {
    void sing() {

        System.out.println("I am singing");
    }
    void fly() {

        System.out.println("I am flying");
    }
    void walk() {

        System.out.println("I am walking");
    }
    void whoAmI() {

        System.out.println("I am Bird");
    }
}

