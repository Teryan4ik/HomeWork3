package App;

abstract class Animal {
    private final int maxRunLength;
    private final int maxSwimLength;


    public static int counter;

    public Animal(int maxRunLength, int maxSwimLength) {
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
        counter++;
    }

    abstract void run(int obstacle);

    abstract void swim(int obstacle);


}