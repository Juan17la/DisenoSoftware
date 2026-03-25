public class App {
    public static void main(String[] args) throws Exception {
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Buddy");
        Cat cat1 = new Cat("Whiskers");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(cat1);

        dog1.greets();
        dog1.greets(dog2);
        cat1.greets();
    }
}
