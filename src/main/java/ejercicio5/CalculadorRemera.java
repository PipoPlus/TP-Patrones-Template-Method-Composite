package ejercicio5;

public abstract class CalculadorRemera implements Remera{

    double precio;

    public CalculadorRemera(double precio){
        this.precio = precio;
    }


    public double calcularPrecioFinal() {
        double precioConRecargos = aplicarRecargo(this.precio);
        double precioConImpuestos = aplicarImpuesto(precioConRecargos);
        double precioFinal = aplicarPrecioFinal(precioConImpuestos);
        return precioFinal;
    }


    public abstract double aplicarRecargo(double precio);
    public abstract double aplicarImpuesto(double precio);
    public abstract double aplicarPrecioFinal(double precio);

}
