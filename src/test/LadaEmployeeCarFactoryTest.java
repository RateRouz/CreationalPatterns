package test;

import main.pattern.EmployeeCarFactory;
import main.pattern.manufacturing.LadaEmployeeCarFactory;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class LadaEmployeeCarFactoryTest {
    EmployeeCarFactory ladaFactory = new LadaEmployeeCarFactory();

    @Test
    void createDesigner() {
        assertEquals("LadaDesigner", ladaFactory.createDesigner().getClass().getSimpleName());
    }

    @Test
    void createEngineer() {
        assertEquals("LadaEngineer", ladaFactory.createEngineer().getClass().getSimpleName());
    }

    @Test
    void createManager() {
        assertEquals("LadaManager", ladaFactory.createManager().getClass().getSimpleName());
    }
}