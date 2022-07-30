package pl.arendt;

public class Human {

    private String firstName;

    private String lastName;

    private Animal animal;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.animal = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

}
