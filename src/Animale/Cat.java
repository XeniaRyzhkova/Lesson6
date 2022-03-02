package Animale;

class Cat extends Animal {
    private static final int swimLimit = 0;

    Cat(int runLimit) {
        super(runLimit, -1);
    }

    @Override
    public String run(int distance) {
        return getClassName() + "cant't swim";
    }
}

