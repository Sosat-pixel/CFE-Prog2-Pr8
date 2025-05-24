package Ejercicio3;

public class Support extends Campeon{

    private int curacion;

    public Support(String nombre, String rol, int ataque, int defensa, int velocidad,int curacion){
        super(nombre, rol, ataque, defensa, velocidad);
        this.curacion = curacion;
    }
    void curar(){
       if(this.salud < 100){
        this.salud = this.curacion / 10;
       }else{
           System.out.println("Salud al máximo");
       }
    }
}
