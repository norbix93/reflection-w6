
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cars  {


    public static List<Car> asList() {
        List<Car> cars = new ArrayList<>();
        List<String> brands = Arrays.asList("Audi", "BMW", "Bugatti","Peugeot", "Citroen","Seat","Tesla","Mercedes","Skoda","Yugo");
        for (String brand : brands) {
            cars.add(getNextCar(brand));
        }
        return cars;
    }

    public static Car getNextCar(String brand){
        List<Car> cars = Arrays.asList(new AutomaticCar(brand),new ManualCar(brand));
        Random random = new Random();
        int randomPosition = random.nextInt(2);
        return cars.get(randomPosition);

        /*Boolean isManual = random.nextBoolean();
        if (isManual) {
            return new ManualCar(brand);
        }else
            return new AutomaticCar(brand);*/
    }
}
