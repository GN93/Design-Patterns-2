package factory;

import units.BMW;
import units.BMWModel;
import units.Ford;
import units.FordModel;

public interface Factory {
    BMW buildBMW(BMWModel model);
    Ford buildFord(FordModel model);
}
