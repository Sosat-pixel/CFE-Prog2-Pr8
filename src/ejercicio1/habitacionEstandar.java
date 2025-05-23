package ejercicio1;

public class habitacionEstandar extends habitacion {

    public habitacionEstandar(int numero,double precioBase){
        super(numero,"Estandar",precioBase);
    }
    @Override
    public void calcularPrecioFinal(int dias){
        System.out.println("El precio final es: "+ (precioBase * dias));
    }
}
