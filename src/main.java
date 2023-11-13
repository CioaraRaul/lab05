import leaguePlayer.Vehicle;
import leaguePlayer.VehicleBicycle;
import leaguePlayer.VehicleCar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class main {
    public static void main(String[] args) {
    Vehicle bmw = new VehicleCar(12,2 , "bmw", "seria4");
    Vehicle bike = new VehicleBicycle(100, 21, "bita", "muntoasa");

    bmw.speedUp();

    List<Vehicle> vehicles = new ArrayList <>();
        vehicles.add(bmw);
        vehicles.add(bike);

        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }

//    System.out.println(((VehicleCar) bmw).getSpeedCar());
//    System.out.println(((VehicleBicycle) bike).getSpeedBicycle());

//    Vehicle audi = new VehicleBicycle(100, "mountain bike");
//    System.out.println(((VehicleCar) bmw).getSpeedCar());
//    System.out.println(((VehicleBicycle) audi).getSpeedBicycle());
//
//    int bmwSpeed = bmw.getSpeed();
//    int mountainBikeSpeed = audi.getSpeed();
//
//
//    if (bmwSpeed >  mountainBikeSpeed){
//        System.out.println("Bmw has higher speed than  mountainBike with: " + (bmwSpeed -  mountainBikeSpeed));
//    } else {
//        System.out.println(" mountainBike has higher speed than bmw with: " + ( mountainBikeSpeed - bmwSpeed));
//    }
//

//    Map<String, Integer> vehicleMap = new HashMap<>();
//    vehicleMap.put("Audi", 42);
//    vehicleMap.put("Bmw", 100);
//    System.out.println(vehicleMap);



    }
}
