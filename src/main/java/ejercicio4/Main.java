package ejercicio4;

public class Main {

    public static void main(String[] args){
        LogTransaction log = new LogTransaction();
        int mesEnPromocion = 5;

        Calculador calculadorJubilado = new CalculadorJubilado(log, mesEnPromocion);
        Calculador calculadorNoJubilado = new CalculadorNoJubilado(log, mesEnPromocion);

        double precioProducto = 100.0;

        double precioJubilado = calculadorJubilado.calcularPrecio(precioProducto);
        double precioNoJubilado = calculadorNoJubilado.calcularPrecio(precioProducto);

        System.out.println("Precio para jubilado: " + precioJubilado);
        System.out.println("Precio para no jubilado: " + precioNoJubilado);
    }

}
