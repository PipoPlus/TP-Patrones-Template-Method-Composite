package ejercicio3;

public class SeguroParticular implements Seguro{

    double precio;


    public SeguroParticular(double precio){
        this.precio = precio;
    }


    @Override
    public double calcularCosto() {
        return this.precio;
    }

}
