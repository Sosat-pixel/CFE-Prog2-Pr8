package ejercicio1;

public class habitacionSuitePresiencial extends habitacion {

    public habitacionSuitePresiencial(int nombre, double precioBase){
        super(nombre,"SuitePresidencial",precioBase);
    }
    @Override
    public void calcularPrecioFinal(int dias){
        double resultado = precioBase;
        resultado = ((precioBase * 1.5) * dias);
        if(dias > 5){
            resultado -= resultado * 0.10;
            System.out.println("El precio final es: "+ resultado);

        }else{
            System.out.println("El precio final es: "+ resultado);

        }
    }
}
