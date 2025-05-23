package Ejercicio2;

public class Gato extends Animal {

    private String color;


    public Gato(String nombre,int edad, String color){
       super(nombre, edad, "gato");
       this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", color: " + this.color + ")";
    }
}
