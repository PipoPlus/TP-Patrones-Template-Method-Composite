package ejercicio4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static java.time.LocalDate.now;
import static org.junit.jupiter.api.Assertions.*;

class DescuentosTest {
    public static final double PRECIO_PRODUCTO = 100.0;
    LogTransaction log;
    int mesEnPromocionNoJubilado;
    int mesEnPromocionJubilado;
    Calculador calculadorJubilado;
    Calculador calculadorNoJubilado;

    @BeforeEach
    public void setUp() {
        log = new LogTransaction();
        mesEnPromocionNoJubilado = LocalDate.now().getMonthValue();
        mesEnPromocionJubilado = LocalDate.now().plusMonths(1).getMonthValue();

        calculadorJubilado = new CalculadorJubilado(log, mesEnPromocionJubilado);
        calculadorNoJubilado = new CalculadorNoJubilado(log, mesEnPromocionNoJubilado);
    }

    @Test
    public void testCalcularPrecioParaJubiladoFueraDePromocion() {
        double precioProducto = PRECIO_PRODUCTO;
        double precioEsperado = 110.0;
        assertEquals(precioEsperado, calculadorJubilado.calcularPrecio(precioProducto));
    }

    @Test
    public void testCalcularPrecioParaNoJubiladoEnPromocion() {
        double precioProducto = PRECIO_PRODUCTO;
        double precioEsperado = 115.0;
        assertEquals(precioEsperado, calculadorNoJubilado.calcularPrecio(precioProducto));
    }

    @Test
    public void testCalcularPrecioParaNoJubiladoFueraDePromocion() {
        int mesAnterior = LocalDate.now().minusMonths(1).getMonthValue();
        calculadorNoJubilado = new CalculadorNoJubilado(log, mesAnterior);

        double precioProducto = PRECIO_PRODUCTO;
        double precioEsperado = 121.0;
        assertEquals(precioEsperado, calculadorNoJubilado.calcularPrecio(precioProducto));
    }

}