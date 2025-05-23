package Ejercicio2;

public class main {
    public static void main(String[] arg){

        Animal a1 = new Animal("Paco",2,"Loro");
        Perro p1 = new Perro("Joaco",2,"Pastor Aleman");
        Gato g1 = new Gato("SnowBall",14,"Naranjoso");
        Conejo c1 = new Conejo("Paquito",4,12);


        Animal array[] = {a1,p1,g1,c1};

        for(int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
