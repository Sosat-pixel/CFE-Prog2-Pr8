package Ejercicio3;

public class MidLaner extends Campeon{

    private int poderMagico;


    public MidLaner(String nombre, String rol, int ataque, int defensa, int velocidad, int poderMagico){
        super(nombre, rol, ataque, defensa, velocidad);
        this.poderMagico = poderMagico;
    }

    void recibirDanio(int danio){
        int danioFinal = 0;
        if(this.salud >= 0 && this.ataque > 0){
            danioFinal = danio - (poderMagico / 8);
            System.out.println("Se han recibido:" + danio + "de daño");
        }else{
            System.out.println("Ataque fallado");
        }
    }
}
