package App;

public class Dog extends Animal {
    public static int counter;

    public Dog() {
        counter++;
    }

    @Override
    public void run(int obstacle) {
        if (obstacle <= 500) {
            System.out.println("Dog run " + obstacle + " meters");
        } else {
            System.out.println("The dog will not be able to run " + obstacle + " meters" + "... He will get tired ");
        }
    }

    @Override
    public void swim(int obstacle) {
        if (obstacle <= 10) {
            System.out.println("Dog swim " + obstacle + " meters");
        } else {
            System.out.println("The dog will not be able to swim " + obstacle + "... He will get tired ");
        }
    }

}
