package ejercicio1;

public class habitacionSuite extends habitacion {

    public habitacionSuite(int numero, double precioBase){
        super(numero,"Suite",precioBase);
    }
    @Override
    public void calcularPrecioFinal(int dias){
        System.out.println("El precio final es: "+ ((precioBase * 1.2) * dias));
    }
}
