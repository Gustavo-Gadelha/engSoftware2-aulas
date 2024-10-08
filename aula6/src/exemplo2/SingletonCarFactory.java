package exemplo2;

public class SingletonCarFactory {
    private static SingletonCarFactory instance;
    private int totalCars;

    private SingletonCarFactory() {
    }

    public static SingletonCarFactory getInstance() {
        if (instance == null) {
            instance = new SingletonCarFactory();
        }
        return instance;
    }

    public Car buildCar(String model, String category) {
        Car car = new Car();
        car.setCategory(category);
        car.setModel(model);
        totalCars++;
        return car;
    }

    public void getTotalCars() {
        System.out.println("Total de carros: " + totalCars);
    }
}
