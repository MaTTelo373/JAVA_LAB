package pl.arendt;

public class Car {


    private final String model;

    private final String producer;



    private Double engineSize;
    private String fuelType;

    private Double value;

    public Car(String model, String producer, Double value) {
        this.model = model;
        this.producer = producer;
        this.engineSize = 1.0d;
        this.fuelType = "gas";
        this.value = value;
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


    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        if (value < 0) {
            throw new IllegalStateException("Value cannot be less than 0!");
        }
        this.value = value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", engineSize=" + engineSize +
                ", fuelType='" + fuelType + '\'' +
                ", value=" + value +
                '}';
    }
}
