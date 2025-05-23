package Ejercicio2;

public class Conejo  extends Animal {

    private double peso;

    public Conejo(String nombre, int edad,double peso){
        super(nombre, edad, "conejo");
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre: " + this.nombre + '\'' +
                ", edad: " + this.edad +
                ", peso: " + this.peso + " KG " +
                ", especie: " + this.especie + '\'' +
                '}';
    }
}
