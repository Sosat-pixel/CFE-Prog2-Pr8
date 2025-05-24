package Ejercicio3;

public class Junga extends Campeon{

    private int controlMapa;

    public Junga(String nombre, String rol, int ataque, int defensa, int velocidad, int controlMapa){
        super(nombre, rol, ataque, defensa, velocidad);
        this.controlMapa = controlMapa;
    }

    int ataqueEspecial(){
       return super.ataqueEspecial() + (controlMapa / 5);
    }
}
