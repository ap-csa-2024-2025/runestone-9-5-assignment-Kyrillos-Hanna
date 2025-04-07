public class Cat extends Animal{
    private int numLives = 9;
    private String name;

    public Cat(String name) {
        super(name, "feline");
    }

    public Cat(String name, int numLives) {
        this(name);
        this.numLives = numLives;
    }

    public void matingCall() {
        System.out.println("meow");
    }

    public int getNumLives() {
        return numLives;
    }


}