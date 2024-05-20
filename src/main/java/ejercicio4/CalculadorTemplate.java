package ejercicio4;


public abstract class CalculadorTemplate implements Calculador{
    protected LogTransaction log;
    protected int mesEnPromocion;

    public CalculadorTemplate(LogTransaction log, int mesEnPromocion){
        this.log = log;
        this.mesEnPromocion = mesEnPromocion;
    }

    @Override
    public double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (aplicaDescuento()) {
            precioTotal += precioProducto * getDescuentoPromocion();
        } else {
            precioTotal += precioProducto * getDescuentoNormal();
        }
        log.log(this.getClass().getName());
        return precioTotal;
    }

    protected abstract boolean aplicaDescuento();
    protected abstract double getDescuentoNormal();
    protected abstract double getDescuentoPromocion();
}
