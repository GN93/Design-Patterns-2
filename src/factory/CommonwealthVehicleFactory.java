package factory;

import units.*;

public class CommonwealthVehicleFactory implements Factory {

    @Override
    public BMW buildBMW(BMWModel model) {
        switch (model){
            case X5:
                return new BMW(BMWModel.X5,2009, 300, SteeringWheel.LEFT);
            case E30:
                return new BMW(BMWModel.E30,2013, 80, SteeringWheel.LEFT);
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public Ford buildFord(FordModel model) {
        switch (model){
            case FOCUS:
                return new Ford(FordModel.FOCUS,2019, 212, SteeringWheel.LEFT);
            case FIESTA:
                return new Ford(FordModel.FIESTA,2015, 99, SteeringWheel.LEFT);
            default:
                throw new IllegalArgumentException();
        }
    }
}
