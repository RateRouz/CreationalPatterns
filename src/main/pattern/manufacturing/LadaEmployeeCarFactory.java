package main.pattern.manufacturing;

import main.pattern.EmployeeCarFactory;
import main.pattern.manufacturing.lada.LadaDesigner;
import main.pattern.manufacturing.lada.LadaEngineer;
import main.pattern.manufacturing.lada.LadaManager;
import main.pattern.manufacturing.model.Designer;
import main.pattern.manufacturing.model.Engineer;
import main.pattern.manufacturing.model.Manager;

/**
 * Класс LadaConcernFactory релизующий интрефейс {@link EmployeeCarFactory}
 */

public class LadaEmployeeCarFactory implements EmployeeCarFactory {
    @Override
    public Designer createDesigner() {
        return new LadaDesigner();
    }

    @Override
    public Engineer createEngineer() {
    return new LadaEngineer();
    }

    @Override
    public Manager createManager() {
    return new LadaManager();
    }
}
