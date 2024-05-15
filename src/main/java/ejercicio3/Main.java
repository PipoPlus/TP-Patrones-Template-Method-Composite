package ejercicio3;

public class Main {

    public static void main(String[] args){
        SeguroParticular seguroVida = new SeguroParticular(100);
        SeguroParticular seguroAuto = new SeguroParticular(200);
        SeguroParticular seguroHogar = new SeguroParticular(300);

        PaqueteSeguros paquete = new PaqueteSeguros();
        paquete.agregarSeguro(seguroVida);
        paquete.agregarSeguro(seguroAuto);
        paquete.agregarSeguro(seguroHogar);

        System.out.println("Costo del Paquete de Seguros: $" + paquete.calcularCosto());

        // Crear un segundo paquete que incluye el primer paquete y un seguro adicional
        SeguroParticular seguroMedico = new SeguroParticular(400);
        PaqueteSeguros superPaquete = new PaqueteSeguros();
        superPaquete.agregarSeguro(paquete);
        superPaquete.agregarSeguro(seguroMedico);

        System.out.println("Costo del Super Paquete de Seguros: $" + superPaquete.calcularCosto());


    }
}