public class Dog extends Animal {
    private String breed;

    public Dog() {
        super();
        this.breed = "canine";
    }

    public String getBreed() {
        return this.breed;
    }

    public void wagTail() {
        System.out.println("waggin");
    }

    public void matingCall() {
        System.out.println("woof");
    }

}