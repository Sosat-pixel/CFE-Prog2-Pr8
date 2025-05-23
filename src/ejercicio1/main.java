package ejercicio1;

public class main {
    public static void main(String[] arg){

        habitacionEstandar h1 = new habitacionEstandar(100,100);
        habitacionSuite h2 = new habitacionSuite(101,120);
        habitacionSuitePresiencial h3 = new habitacionSuitePresiencial(102,200);

        h1.mostrarDetalle();
        h1.calcularPrecioFinal(2);
        h2.mostrarDetalle();
        h2.calcularPrecioFinal(2);
        h3.mostrarDetalle();
        h3.calcularPrecioFinal(6);

    }
}
