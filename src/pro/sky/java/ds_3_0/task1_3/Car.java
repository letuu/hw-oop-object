package pro.sky.java.ds_3_0.task1_3;

public class Car {

    private final String brand;
    private final String model;
    private final String  engineVolume;
    private final String color;
    private final int productionYear;
    private final String productionCountry;

    public Car(String brand, String model, String engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume == null) {
            this.engineVolume = "1,5";
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
    }


    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String  getEngineVolume() {
        return engineVolume;
    }
    public String getColor() {
        return color;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }

    @Override
    public String toString() {
        return brand + " " + model + "; объем двигателя: " + engineVolume + "; цвет: " + color + "; год выпуска: " + productionYear + "; сборка: " + productionCountry;
    }
}
