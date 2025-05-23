package Ejercicio2;

public class Gato extends Animal {

    private String color;


    public Gato(String nombre,int edad, String color){
       super(nombre, edad, "gato");
       this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre: " + this.nombre + '\'' +
                ", edad: " + this.edad +
                ", color: " + this.edad +
                ", especie: " + this.especie + '\'' +
                '}';
    }
}
