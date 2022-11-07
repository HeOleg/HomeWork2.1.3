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
        return "Бренд: " + brand +
                ". Модель: " + model +
                ". Объем двигателя: " + engineCapacity +
                ". Цвет кузова: " + bodyColor +
                ". Год выпуска: " + productionYear +
                " Страна выпуска: " + assemblyCountry + ".";
    }
}
