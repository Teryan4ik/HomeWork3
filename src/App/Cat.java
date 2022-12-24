package App;

public class Cat extends Animal {

    public static int counter;

    public Cat() {
        counter++;
    }

    @Override
    public void run(int obstacle) {
        if (obstacle <= 200) {
            System.out.println("Cat run " + obstacle + " meters");
        } else {
            System.out.println("The cat will not be able to run " + obstacle + " meters" + "... He will get tired ");
        }
    }

    @Override
    public void swim(int obstacle) {
        if (obstacle >= 0) {
            System.out.println("The cat can't swim :(");
        }
    }
}
