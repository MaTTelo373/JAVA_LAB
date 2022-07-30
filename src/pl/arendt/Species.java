package pl.arendt;

public enum Species {
    DOG(5d),
    CAT(1.5d),
    RABBIT(1d),
    SPIDER(0.1d);


    private Double defaultWeight;

    Species(Double defaultWeight) {
        this.defaultWeight = defaultWeight;
    }

    public Double getDefaultWeight() {
        return defaultWeight;
    }

    @Override
    public String toString() {
        return "Species{" +
                "defaultWeight=" + defaultWeight +
                "} " + super.toString();
    }
}
