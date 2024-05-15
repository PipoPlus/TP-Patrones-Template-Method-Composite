package ejercicio1;

public class EmpleadoRegular implements Empleado{

    private Double salario;

    public EmpleadoRegular(Double salario) {
        this.salario = salario;
    }

    @Override
    public Double calcularSalarios() {
        return salario;
    }
}
