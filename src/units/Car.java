package units;

public abstract class Car {

    private int year;
    private int hp;
    private SteeringWheel steeringWheel;

    public Car(int year, int hp, SteeringWheel steeringWheel) {
        this.year = year;
        this.hp = hp;
        this.steeringWheel = steeringWheel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", hp=" + hp +
                ", steeringWheel=" + steeringWheel +
                '}';
    }
}
