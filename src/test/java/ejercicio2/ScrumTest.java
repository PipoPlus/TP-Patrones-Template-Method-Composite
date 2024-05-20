package ejercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScrumTest {
    private Proyecto proyecto;
    private HistoriaUsuario historia1;
    private HistoriaUsuario historia2;
    private HistoriaUsuario historia3;

    @BeforeEach
    public void setUp() {
        Tarea tarea1 = new Tarea(2);
        Tarea tarea2 = new Tarea(5);
        Spike spike1 = new Spike(1);

        historia1 = new HistoriaUsuario();
        historia1.agregarItem(tarea1);
        historia1.agregarItem(tarea2);

        historia2 = new HistoriaUsuario();
        historia2.agregarItem(spike1);

        Tarea tarea3 = new Tarea(3);
        Spike spike2 = new Spike(4);

        historia3 = new HistoriaUsuario();
        historia3.agregarItem(tarea3);
        historia3.agregarItem(spike2);

        proyecto = new Proyecto();
        proyecto.agregarHistoria(historia1);
        proyecto.agregarHistoria(historia2);
        proyecto.agregarHistoria(historia3);
    }

    @Test
    public void testCalcularTiempoProyectoConHistorias() {
        int horaEseperada = 15;
        assertEquals(horaEseperada, proyecto.calcularTiempo());
    }

    @Test
    public void testCalcularTiempoHistoriaUsuario() {
        int horaEsperada = 15;
        assertEquals(horaEsperada, historia1.calcularTiempo());
    }
}
