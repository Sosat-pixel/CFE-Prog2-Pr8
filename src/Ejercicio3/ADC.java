package Ejercicio3;

public class ADC extends Campeon{

    private int rango;

    public ADC(String nombre, String rol,int ataque,int defensa, int velocidad,int rango){
        super(nombre, rol, ataque, defensa, velocidad);
        this.rango = rango;
    }

    int atacar(){
        return super.atacar() + (rango / 4);
    }
}
