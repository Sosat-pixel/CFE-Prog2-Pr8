package Ejercicio3;

public class Campeon {

    protected String nombre;
    protected String rol;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected int salud;


    public Campeon(String nombre, String rol, int ataque, int defensa, int velocidad){
        this.nombre = nombre;
        this.rol = rol;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.salud = 100;
    }

    int atacar(){
        System.out.println("Ataque realizado");
        return this.salud -= (ataque + velocidad) / 2;
    }

    int ataqueEspecial(){
        System.out.println("Ataque especial realizado");
        return this.salud -= (ataque + defensa) / 2;
    }
    void recibirDanio(int danio){
        int danioFinal = 0;
        if(this.salud >= 0 && this.ataque > 0){
            danioFinal = danio;
            System.out.println("Se han recibido:" + danio + "de daño");
        }else{
            System.out.println("Ataque fallado");
        }
    }

    @Override
    public String toString() {
        return "Campeon (" +
                "nombre: " + nombre +
                ",rol: " + rol +
                ",ataque: " + ataque +
                ",defensa: " + defensa +
                ",velocidad: " + velocidad +
                ",salud: " + salud;
    }
}
