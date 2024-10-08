package exemplo2;

public class Main {
    public static void main(String[] args) {
        SingletonCarFactory factory = SingletonCarFactory.getInstance();

        Car car1 = factory.buildCar("modelo1", "categoria1");
        Car car2 = factory.buildCar("modelo2", "categoria2");
        Car car3 = factory.buildCar("modelo3", "categoria3");
        Car car4 = factory.buildCar("modelo4", "categoria4");
        Car car5 = factory.buildCar("modelo5", "categoria5");

        factory.getTotalCars();
    }
}
