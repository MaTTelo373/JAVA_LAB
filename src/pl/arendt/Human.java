package pl.arendt;

import pl.arendt.devices.Car;

public class Human {

    private String firstName;

    private String lastName;

    private Animal animal;

    private Car car;


    private Double salary;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.animal = null;
        this.car = null;
        this.salary = 100d;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (this.salary > car.getValue()) {
            System.out.println("Happy day you bought:" + car.toString());
        } else {
            if (this.salary > car.getValue()/12d) {
                System.out.println("Happy day you bought:" + car.toString());
                System.out.println("Every month from now till next year you have to pay rate:" + car.getValue()/12);
            } else {
                System.out.println("Sorry car is too expensive! We have bikes for " + this.salary/2 + " only ...");
                return;
            }
        }
        this.car = car;
    }


    public Double getSalary() {
        System.out.println("I am poor man, my salary is "+ salary);
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            throw new IllegalStateException("Salary cannot be less than 0!");
        }
        if (this.salary > salary) {
            System.out.println(salary + " is less than " + this.salary + " Your are joking i fuck this job, Buy!");
            throw new IllegalStateException("Not acceptable!");
        }
        if (this.salary < salary) {
            System.out.println("Oh nice I am going for long holidays from now!");
        }
        System.out.println("New salary was sent to accountant office!");
        System.out.println("Miss Hania give you a new ticket about it ...");
        System.out.println("Uncle Sam knows everything, your taxes will be higher !!!");


        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", animal=" + animal +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (firstName != null ? !firstName.equals(human.firstName) : human.firstName != null) return false;
        if (lastName != null ? !lastName.equals(human.lastName) : human.lastName != null) return false;
        if (animal != null ? !animal.equals(human.animal) : human.animal != null) return false;
        if (car != null ? !car.equals(human.car) : human.car != null) return false;
        return salary != null ? salary.equals(human.salary) : human.salary == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (animal != null ? animal.hashCode() : 0);
        result = 31 * result + (car != null ? car.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        return result;
    }
}
