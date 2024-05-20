package ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends CalculadorTemplate {
    private static final double DESCUENTO_NORMAL = 0.21;
    private static final double DESCUENTO_PROMOCION = 0.15;


    public CalculadorNoJubilado(LogTransaction log, int mesEnPromocion){
        super(log,mesEnPromocion);
    }


    @Override
    public boolean aplicaDescuento() {
        return of(mesEnPromocion).equals(now().getMonth());
    }

    @Override
    public double getDescuentoNormal() {
        return DESCUENTO_NORMAL;
    }

    @Override
    public double getDescuentoPromocion() {
        return DESCUENTO_PROMOCION;
    }
}

