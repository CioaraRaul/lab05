package leaguePlayer;

public class VehicleCar extends Vehicle {
    private String car;
    private String type;
    private String speedUpVar;
    public VehicleCar(int speed,int increaseSpeed, String car, String type){
        super(speed,increaseSpeed);
        this.car = car;
        this.type = type;

    }
//    public void setSpeed(int speed){
//        super.setSpeed(speed);
//    }
      @Override
      public void speedUp() {
        System.out.println("10 km");
      }

    public int getSpeedCar(){
         super.setSpeed(increaseSpeed);
         System.out.println("the speed normally was: " + speed);
         return speed + increaseSpeed;
    }

    public String getCarName(){
        return car;
    }
    public String getCarType(){
        return type;
    }

}
