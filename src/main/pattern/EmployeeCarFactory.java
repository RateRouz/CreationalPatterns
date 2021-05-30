package main.pattern;

import main.pattern.manufacturing.model.Designer;
import main.pattern.manufacturing.model.Engineer;
import main.pattern.manufacturing.model.Manager;
public interface EmployeeCarFactory {
    Designer createDesigner();

    Engineer createEngineer();

    Manager createManager();

}
