package ejercicio3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SegurosTest {

    private SeguroParticular seguroVida;
    private SeguroParticular seguroAuto;
    private SeguroParticular seguroHogar;
    private SeguroParticular seguroMedico;
    private PaqueteSeguros paquete;
    private PaqueteSeguros superPaquete;

    @BeforeEach
    void setUp() {

        seguroVida = new SeguroParticular(100);
        seguroAuto = new SeguroParticular(200);
        seguroHogar = new SeguroParticular(300);
        seguroMedico = new SeguroParticular(400);


        paquete = new PaqueteSeguros();
        paquete.agregarSeguro(seguroVida);
        paquete.agregarSeguro(seguroAuto);
        paquete.agregarSeguro(seguroHogar);


        superPaquete = new PaqueteSeguros();
        superPaquete.agregarSeguro(paquete);
        superPaquete.agregarSeguro(seguroMedico);
    }

    @Test
    void testCostoPaquete() {
        assertEquals(510, paquete.calcularCosto());
    }

    @Test
    void testCostoSuperPaquete() {
        assertEquals(819, superPaquete.calcularCosto());
    }


}