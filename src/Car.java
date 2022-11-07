public class Car {

    String brand;
    String model;
    double engineCapacity;
    String bodyColor;
    int productionYear;
    String assemblyCountry;

    public Car(String brand, String model, double engineCapacity, String bodyColor,
               int productionYear, String assemblyCountry) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.bodyColor = bodyColor;
        this.productionYear = productionYear;
        this.assemblyCountry = assemblyCountry;
    }

    @Override
    public String toString() {
        return "Бренд: " + getBrand() +
                ". Модель: " + getModel() +
                ". Объем двигателя: " + getEngineCapacity()+
                ". Цвет кузова: " + getBodyColor() +
                ". Год выпуска: " + getProductionYear() +
                " Страна выпуска: " + getProductionYear() + ".";
    }

    public String getBrand() {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            return this.brand;
        } else {
            return "default";
        }
    }

    public String getModel() {
            if (model != null && !model.isEmpty() && !model.isBlank()) {
                return this.model;
            } else {
                return "default";
            }
        }

    public double getEngineCapacity() {
        if (engineCapacity != 0) {
            return this.engineCapacity;
        } else {
            return 1.5;
        }
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public int getProductionYear() {
        if (productionYear != 0) {
            return productionYear;
        } else {
            return 2000;
        }
    }

    public String getAssemblyCountry() {
        if ( assemblyCountry != null && !assemblyCountry.isEmpty() && !assemblyCountry.isBlank()){
            return this.assemblyCountry;
        }
        else {
            return "default";
        }
    }
}
