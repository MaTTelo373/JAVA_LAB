package pl.arendt;

public class Animal {


    private String name;

    private Species species;

    private Double weight;

    public Animal(String name, Species species) {
        this.name = name;
        this.species = species;
        this.weight = species.getDefaultWeight();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    void feed(Double foodWeight) {
        weight += foodWeight;
        System.out.println("I don't want to be fat ...");
        System.out.println("my weight is now " + weight);
    }

    void takeForAWalk(int period) { // ile minut, kazde 60 minut powoduje utrate wagi o 1%
        weight -= 0.01*weight*(double)period/60d;
        weight = weight < 0 ? 0 : weight;
        System.out.println("Thanks for a walk for " + period + " minutes ... I will never be olimpic master!");
        if (weight <= 0) {
            System.out.println("Sorry I am DEAD ...");
        }
    }

}
