public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Grande", 1.7, "жёлтый", 2015, "Россия" );
        Car audi = new Car("Audi", "A8 50 L TDI quatro", 3, "черный", 2020, "Германия" );
        Car bmw = new Car("BMW", "Z8", 3.0, "чёрный", 2021, "Германия" );
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, "красный", 2018, "Южная Корея" );
        Car hyunday = new Car("Hyunday", "Avante", 1.6, "оранжевый", 2016, "Южная Корея" );

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyunday.toString());

    }
}