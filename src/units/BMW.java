package units;

public class BMW extends Car{

    private BMWModel model;

    public BMW(BMWModel model, int year, int hp, SteeringWheel steeringWheel) {
        super(year, hp, steeringWheel);
        this.model = model;
    }

    public BMWModel getModel() {
        return model;
    }

    public void setModel(BMWModel model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString() + "BMW{" +
                "model=" + model +
                '}';
    }
}
