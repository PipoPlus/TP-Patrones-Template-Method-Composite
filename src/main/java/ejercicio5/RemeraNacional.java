package ejercicio5;

public class RemeraNacional extends CalculadorRemera {


    public static final double SUMA_RECARGO = 0.015;
    public static final double SUMA_IMPUESTO = 0.20;
    public static final double SUMA_PRECIO_FINAL = 0.15;

    public RemeraNacional(double precio) {
        super(precio);
    }

    @Override
    public double aplicarRecargo(double precio) {
        return precio + (precio * SUMA_RECARGO);
    }

    @Override
    public double aplicarImpuesto(double precio) {
        return precio - (precio * SUMA_IMPUESTO);
    }

    @Override
    public double aplicarPrecioFinal(double precio) {
        return precio + (precio * SUMA_PRECIO_FINAL);
    }
}
