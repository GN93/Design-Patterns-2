import factory.CommonwealthVehicleFactory;
import factory.ContinentalVehicleFactory;
import units.BMW;
import units.BMWModel;
import units.Ford;
import units.FordModel;

public class Main {

    public static void main(String[] args) {

        CommonwealthVehicleFactory commonwealthVehicleFactory = new CommonwealthVehicleFactory();
        ContinentalVehicleFactory continentalVehicleFactory = new ContinentalVehicleFactory();

        BMW bmwRight = commonwealthVehicleFactory.buildBMW(BMWModel.E30);
        System.out.println(bmwRight);
        BMW bmwLeft = continentalVehicleFactory.buildBMW(BMWModel.X5);
        System.out.println(bmwLeft);
        Ford fordRight = commonwealthVehicleFactory.buildFord(FordModel.FOCUS);
        System.out.println(fordRight);
        Ford fordLeft = continentalVehicleFactory.buildFord(FordModel.FIESTA);
        System.out.println(fordLeft);
    }
}