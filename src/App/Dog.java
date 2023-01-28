package App;

class Dog extends Animal {
    private final static int MAX_RUN_LENGTH = 500;
    private final static int MAX_SWIM_LENGTH = 10;
    public static int counter;


    public Dog() {
        super(MAX_RUN_LENGTH, MAX_SWIM_LENGTH);
        counter++;
    }

    @Override
    void run(int obstacle) {
        if ((obstacle >= 0) && (obstacle <= MAX_RUN_LENGTH)) System.out.println("Dog run " + obstacle + " meters");
    }

    @Override
    void swim(int obstacle) {
        if ((obstacle >= 0) && (obstacle <= MAX_SWIM_LENGTH)) System.out.println("Dog swim " + obstacle + " meters");
    }

}
