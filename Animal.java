public class Animal
{
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public Animal() {
        this.name = "animalName";
        this.species = "animalSpecies";
    }

    public void matingCall() {
        System.out.println("generic sound");
    }
}