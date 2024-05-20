package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Remera remeraImportada = new RemeraImportada(100.0);
        Remera remeraNacional = new RemeraNacional(100.0);

        System.out.println("Precio final de la remera importada: " + remeraImportada.calcularPrecioFinal());
        System.out.println("Precio final de la remera nacional: " + remeraNacional.calcularPrecioFinal());
    }
}
