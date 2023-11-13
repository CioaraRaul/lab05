package leaguePlayer;

public abstract class Vehicle{
    public int speed;
    public int increaseSpeed;
    public Vehicle(int speed, int increaseSpeed){
        this.speed = speed;
        this.increaseSpeed = increaseSpeed;
    }

    public abstract void speedUp();
    public void setSpeed(int speed){

        this.increaseSpeed = speed;
        System.out.println("Increased with: " + speed );
    }
    public int getSpeed(){
        return this.speed + increaseSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", increaseSpeed=" + increaseSpeed +
                '}';
    }
}
