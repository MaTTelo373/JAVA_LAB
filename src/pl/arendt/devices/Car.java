package pl.arendt.devices;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (producer != null ? !producer.equals(car.producer) : car.producer != null) return false;
        if (engineSize != null ? !engineSize.equals(car.engineSize) : car.engineSize != null) return false;
        if (fuelType != null ? !fuelType.equals(car.fuelType) : car.fuelType != null) return false;
        return value != null ? value.equals(car.value) : car.value == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        result = 31 * result + (engineSize != null ? engineSize.hashCode() : 0);
        result = 31 * result + (fuelType != null ? fuelType.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
