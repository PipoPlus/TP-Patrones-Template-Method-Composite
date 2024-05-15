package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class RolEmpresa implements Empleado {

    private List<Empleado> empleados = new ArrayList<>();

    Double salario;

    public RolEmpresa(Double salario) {
        this.salario = salario;
    }

    public void agregarSubordinado(Empleado subordinado) {
        empleados.add(subordinado);
    }


    @Override
    public Double calcularSalarios() {
        double salarioTotal = 0;
        for (Empleado empleado : empleados) {
            salarioTotal += empleado.calcularSalarios();
        }
        return salarioTotal + salario;
    }

}
