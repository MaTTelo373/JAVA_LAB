package pl.arendt.devices;

public class Phone extends Device {


    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public void turnOn() {
        System.out.println("Phone will be on, can ring!");
    }

}
