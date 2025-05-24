package Ejercicio3;

public class TopLaner extends Campeon {

    private int resistencia;


    public TopLaner(String nombre, String rol,int ataque, int defensa, int velocidad,int resistencia){
        super(nombre,rol,ataque,defensa,velocidad);
        this.resistencia = resistencia;
    }

    void recibirDanio(int danio){
        int danioFinal;
        if(this.salud >= 0 && this.ataque > 0){
            danioFinal = danio - (resistencia/10);
            this.salud = danioFinal;
            System.out.println("Se han recibido: " + danio + " de daño");
        }else{
            System.out.println("Ataque fallado");
        }
    }
}
