package main.pattern.manufacturing;


import main.pattern.EmployeeCarFactory;
import main.pattern.manufacturing.bmw.BMWDesigner;
import main.pattern.manufacturing.bmw.BMWEngineer;
import main.pattern.manufacturing.bmw.BMWManager;
import main.pattern.manufacturing.model.Designer;
import main.pattern.manufacturing.model.Engineer;
import main.pattern.manufacturing.model.Manager;

/**
 * Класс BMWConcernFactory релизующий интрефейс {@link EmployeeCarFactory}
 */
public class BMWEmployeeCarFactory implements EmployeeCarFactory {
    @Override
    public Designer createDesigner() {
        return new BMWDesigner();
    }

    @Override
    public Engineer createEngineer() {
    return new BMWEngineer();
    }

    @Override
    public Manager createManager() {
    return new BMWManager();
    }
}
