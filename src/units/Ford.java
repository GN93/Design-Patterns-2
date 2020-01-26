package units;

public class Ford extends Car{

    private FordModel model;

    public Ford(FordModel model, int year, int hp, SteeringWheel steeringWheel) {
        super(year, hp, steeringWheel);
        this.model = model;
    }

    public FordModel getModel() {
        return model;
    }

    public void setModel(FordModel model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString() + "Ford{" +
                "model=" + model +
                '}';
    }
}
