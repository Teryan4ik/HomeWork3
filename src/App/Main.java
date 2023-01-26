package App;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.run(199);

//        new Cat(50).run(50);
//        new Cat().run(201);
//        new Cat().swim(5);
//
//        new Dog().run(75);
//        new Dog().run(501);
//        new Dog().swim(5);
//        new Dog().swim(11);

        System.out.println("================");
        System.out.print("Cat counters " + Cat.counter + "\n" + "Dog counters " + Dog.counter
                + "\n" + "Animal counters " + Animal.counter);


    }
}