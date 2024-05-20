package ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class SalariosTest {

    EmpleadoRegular empleado1;
    EmpleadoRegular empleado2;
    RolEmpresa liderProyecto1;
    RolEmpresa mandoMedio1;
    RolEmpresa gerente1;
    RolEmpresa director1;

    @BeforeEach
    public void setUp(){
        empleado1 = new EmpleadoRegular(100.0);
        empleado2 = new EmpleadoRegular(100.0);

        liderProyecto1 = new RolEmpresa(100.0);
        liderProyecto1.agregarSubordinado(empleado1);
        liderProyecto1.agregarSubordinado(empleado2);

        mandoMedio1 = new RolEmpresa(100.0);
        mandoMedio1.agregarSubordinado(liderProyecto1);

        gerente1 = new RolEmpresa(100.0);
        gerente1.agregarSubordinado(mandoMedio1);

        director1 = new RolEmpresa(100.0);
        director1.agregarSubordinado(gerente1);
    }


    @Test
    void testCalcularSalariosTotales(){
        double salarioEsperado = 100.0;
        assertEquals(600.0, director1.calcularSalarios());
    }

    @Test
    void testCalcularSalarioEmpleado(){
        double salarioEsperado = 100.0;
        assertEquals(salarioEsperado,empleado1.calcularSalarios());
    }

}