package Ejercicio2;

public class Perro extends Animal {

    private String raza;


    public Perro(String nombre, int edad, String raza){
        super(nombre,edad,"perro");
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre: " + this.nombre + '\'' +
                ", edad: " + this.edad +
                ", raza: " + this.raza +
                ", especie: " + this.especie + '\'' +
                '}';
    }
}
