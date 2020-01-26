package factory;

import units.*;

public class ContinentalVehicleFactory implements Factory {

    @Override
    public BMW buildBMW(BMWModel model) {
        switch (model){
            case X5:
                return new BMW(BMWModel.X5,2009, 300, SteeringWheel.RIGHT);
            case E30:
                return new BMW(BMWModel.E30,2013, 80, SteeringWheel.RIGHT);
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public Ford buildFord(FordModel model) {
        switch (model){
            case FOCUS:
                return new Ford(FordModel.FOCUS,2019, 212, SteeringWheel.RIGHT);
            case FIESTA:
                return new Ford(FordModel.FIESTA,2015, 90, SteeringWheel.RIGHT);
            default:
                throw new IllegalArgumentException();
        }
    }
}
