package main.pattern.manufacturing;

import main.pattern.EmployeeCarFactory;
import main.pattern.manufacturing.model.Designer;
import main.pattern.manufacturing.model.Engineer;
import main.pattern.manufacturing.model.Manager;
import main.pattern.manufacturing.toyota.ToyotaDesigner;
import main.pattern.manufacturing.toyota.ToyotaEngineer;
import main.pattern.manufacturing.toyota.ToyotaManager;


/**
 * Класс ToyotaConcernFactory релизующий интрефейс {@link EmployeeCarFactory}
 */

public class ToyotaEmployeeCarFactory implements EmployeeCarFactory {
    @Override
    public Designer createDesigner() {
        return new ToyotaDesigner();
    }

    @Override
    public Engineer createEngineer() {
    return new ToyotaEngineer();
    }

    @Override
    public Manager createManager() {
    return new ToyotaManager();
    }
}
