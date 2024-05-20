package ejercicio5;

public class RemeraImportada extends CalculadorRemera{
    public static final double SUMA_RECARGO = 0.03;
    public static final double SUMA_IMPUESTO = 0.05;
    public static final double SUMA_PRECIO_FINAL = 0.25;

    public RemeraImportada(double precio) {
        super(precio);
    }

    @Override
    public double aplicarRecargo(double precio) {
        return precio + (precio * SUMA_RECARGO);
    }

    @Override
    public double aplicarImpuesto(double precio) {
        return precio + (precio * SUMA_IMPUESTO);
    }

    @Override
    public double aplicarPrecioFinal(double precio) {
        return precio + (precio * SUMA_PRECIO_FINAL);
    }
}
