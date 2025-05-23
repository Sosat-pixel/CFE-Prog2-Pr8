package Ejercicio2;

public class Animal {

    protected String nombre;

    protected int edad;

    protected String especie;


    public Animal(String nombre,int edad,String especie){
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal (" +
                "nombre: " + this.nombre + '\'' +
                ", edad: " + this.edad +
                ", especie: " + this.especie + '\'';
    }
}
