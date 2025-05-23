package ejercicio1;

public class habitacion {

    private int numero;
    protected String tipo;
    protected double precioBase;

    public habitacion(int numero, String tipo,double precioBase){
        this.numero = numero;
        this.tipo = tipo;
        this.precioBase = precioBase;
    }

    public void calcularPrecioFinal(int dias){
        System.out.println("El precio final es: "+ (this.precioBase * dias));
    }

    public void mostrarDetalle(){
        System.out.println("Número: "+ this.numero);
        System.out.println("Tipo: "+ this.tipo);
        System.out.println("Precio base: " + this.precioBase);
    }
}
