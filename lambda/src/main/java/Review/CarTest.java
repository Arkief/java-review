package Review;

import java.util.ArrayList;
import java.util.List;

public class CarTest {

    public static void main(String[] args) {

        Car car1 = new Car("Audi", 270, 2023);
        Car car2 = Car.builder().make("BMW").topSpeed(280).year(2023).build();
        Car car3 = Car.builder().topSpeed(300).year(2020).build();
        Car car4 = Car.builder().make("Toyota").build();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyota", 140, 1998));
        carList.add(new Car("Audi", 200, 2008));
        carList.add(new Car("BMW", 210, 2020));
        carList.add(new Car("Nissan", 150, 2018));

        System.out.println("Fast Cars");
        System.out.println(filterFastCars(carList));

        System.out.println("New Cars");
        System.out.println(filterNewCars(carList));

        //By using behaviour parameterization
        System.out.println("Fast Cars");
        System.out.println(filter(carList, new CarFastPredicate()));

        System.out.println("New Cars");
        System.out.println(filter(carList, new CarNewPredicate()));

    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars){
            carPredicate.test(car);
            filteredCars.add(car);
        }
        return filteredCars;
    }

    private static List<Car> filterFastCars(List<Car> cars){

        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars){
            if (car.getTopSpeed()>160)
             filteredCars.add(car);
        }
        return filteredCars;
    }

    private static List<Car> filterNewCars(List<Car> cars){

        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars){
            if (car.getYear()>2015)
                filteredCars.add(car);
        }
        return filteredCars;
    }

}
