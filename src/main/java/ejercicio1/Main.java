package ejercicio1;


public class Main {
    public static void main(String[] args) {
        EmpleadoRegular empleado1 = new EmpleadoRegular(100.0);
        EmpleadoRegular empleado2 = new EmpleadoRegular(100.0);

        RolEmpresa liderProyecto = new RolEmpresa(150.0);
        liderProyecto.agregarSubordinado(empleado1);
        liderProyecto.agregarSubordinado(empleado2);

        RolEmpresa mandosMedios = new RolEmpresa(200.0);
        mandosMedios.agregarSubordinado(liderProyecto);

        RolEmpresa gerentes = new RolEmpresa(250.0);
        gerentes.agregarSubordinado(mandosMedios);

        RolEmpresa directores = new RolEmpresa(350.0);
        directores.agregarSubordinado(gerentes);

        Double salarioTotal = directores.calcularSalarios();
        System.out.println("El monto total salarial de la empresa es de $" + salarioTotal);
    }
}