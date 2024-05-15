package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PaqueteSeguros implements Seguro{

    List<Seguro> seguros = new ArrayList<>();
    private static final double MAX_DESCUENTO = 0.50; // Maximo 50% de descuento


    public void agregarSeguro(Seguro seguro){
        seguros.add(seguro);
    }


    @Override
    public double calcularCosto() {
        double costoTotal = 0;
        for (Seguro seguro : seguros) {
            costoTotal += seguro.calcularCosto();
        }

        double descuento = 0.05 * seguros.size();
        if (descuento > MAX_DESCUENTO) {
            descuento = MAX_DESCUENTO;
        }

        return costoTotal * (1 - descuento);
    }
}
