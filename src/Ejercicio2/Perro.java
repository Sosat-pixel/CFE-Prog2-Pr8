package Ejercicio2;

public class Perro extends Animal {

    private String raza;


    public Perro(String nombre, int edad, String raza){
        super(nombre,edad,"perro");
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + ", raza: " + this.raza + ")" ;

    }
}
