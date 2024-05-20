package ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends CalculadorTemplate {


    private static final double DESCUENTO_PROMOCION = 0.1;
    private static final int DESCUENTO_NORMAL = 0;

    public CalculadorJubilado(LogTransaction log, int mesEnPromocion) {
        super(log, mesEnPromocion);
    }

    @Override
    public boolean aplicaDescuento() {
        // No aplica descuento en el mes en promoción
        return !of(mesEnPromocion).equals(now().getMonth());
    }

    @Override
    public double getDescuentoPromocion() {
        return DESCUENTO_PROMOCION;
    }

    @Override
    public double getDescuentoNormal() {
        return DESCUENTO_NORMAL;
    }


}