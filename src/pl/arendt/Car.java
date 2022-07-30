package pl.arendt;

public class Car {


    private final String model;

    private final String producer;


    private Double engineSize;
    private String fuelType;


    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
        this.engineSize = 1.0d;
        this.fuelType = "gas";
    }

    public Double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(Double engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }


    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", engineSize=" + engineSize +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
