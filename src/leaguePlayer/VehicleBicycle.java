package leaguePlayer;

public class VehicleBicycle extends Vehicle {
    public String bicycle;
    public String type;
    public VehicleBicycle(int speed, int increaseSpeed,String bicycle, String type){
        super(speed, increaseSpeed);
        this.bicycle = bicycle;
        this.type = type;
    }
    @Override
    public void speedUp() {
        System.out.println("10 km");
    }
    public int getSpeedBicycle(){
        super.setSpeed(increaseSpeed);
        System.out.println("the speed normally was: " + speed);
        return speed + increaseSpeed;
    }

    public String getBicycleName(){
        return bicycle;
    }
    public String getBicycleType(){
        return type;
    }

    @Override
    public String toString() {
        return "VehicleBicycle{" +
                "speed=" + speed +
                ", increaseSpeed=" + increaseSpeed +
                ", bicycle='" + bicycle + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
