package App;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.run(199);
        cat.run(201);
        cat.swim(10);

        Dog dog = new Dog();
        dog.run(499);
        dog.swim(9);
        dog.run(501);
        dog.swim(11);



        System.out.println("================");
        System.out.print("Cat counters " + Cat.counter + "\n" + "Dog counters " + Dog.counter
                + "\n" + "Animal counters " + Animal.counter);

    }
}