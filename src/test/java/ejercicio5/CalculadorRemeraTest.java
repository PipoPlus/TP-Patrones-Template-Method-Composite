package ejercicio5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadorRemeraTest {

    public static final double PRECIO = 100.0;
    private Remera remeraImportada;
    private Remera remeraNacional;

    @BeforeEach
    public void setUp() {
        remeraImportada = new RemeraImportada(PRECIO);
        remeraNacional = new RemeraNacional(PRECIO);
    }

    @Test
    public void testCalcularPrecioFinalRemeraImportada() {
        double precioEsperado = 135.1875;
        assertEquals(precioEsperado, remeraImportada.calcularPrecioFinal());
    }

    @Test
    public void testCalcularPrecioFinalRemeraNacional() {
        double precioEsperado = 93.38;
        assertEquals(precioEsperado, remeraNacional.calcularPrecioFinal());
    }

}