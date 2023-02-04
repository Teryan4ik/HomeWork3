package App;

class Cat extends Animal {
    private final static int MAX_RUN_LENGTH = 200;
    private final static int MAX_SWIM_LENGTH = 0;
    public static int counter;


    public Cat() {
        super(MAX_RUN_LENGTH, MAX_SWIM_LENGTH);
        counter++;
    }

    @Override
    void run(int obstacle) {
        if ((obstacle >= 0) && (obstacle <= MAX_RUN_LENGTH)) System.out.println("Cat run " + obstacle + " meters");
    }

    @Override
    void swim(int obstacle) {
        if ((obstacle >= 0) && (obstacle <= MAX_SWIM_LENGTH)) System.out.println("Cat swim " + obstacle + " meters");
    }

}


