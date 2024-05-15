package ejercicio2;

public class Main {

    public static void main(String[] args) {
        Tarea tarea1 = new Tarea(5);
        Tarea tarea2 = new Tarea(3);
        Spike spike1 = new Spike(2);

        HistoriaUsuario historia1 = new HistoriaUsuario();
        historia1.agregarItem(tarea1);
        historia1.agregarItem(tarea2);

        HistoriaUsuario historia2 = new HistoriaUsuario();
        historia2.agregarItem(spike1);

        Proyecto proyecto = new Proyecto();
        proyecto.agregarHistoria(historia1);
        proyecto.agregarHistoria(historia2);

        System.out.println("Tiempo total necesario para completar el proyecto: " + proyecto.calcularTiempo() + " horas.");
    }
}
