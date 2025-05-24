package Ejercicio3;

import java.util.Random;

public class main {
    public static void main(String[] arg) {
        Random rand = new Random();
        Campeon[] equipo1 = new Campeon[3];
        Campeon[] equipo2 = new Campeon[3];

        equipo1[0] = new TopLaner("Garen", "top", 80, 70, 40, 30);
        equipo1[1] = new MidLaner("Ahari", "mid", 70, 50, 60, 40);
        equipo1[2] = new ADC("Jinx", "ADC", 85, 40, 75, 35);

        equipo2[0] = new Junga("Lee Sin", "Junga", 75, 60, 65, 45);
        equipo2[1] = new Support("Tresh", "Support", 40, 80, 30, 50);
        equipo2[2] = new MidLaner("Lux", "Mid", 68, 55, 60, 38);

        System.out.println("EQUIPO 1:");
        for (Campeon c : equipo1) System.out.println(c);
        System.out.println("EQUIPO 2:");
        for (Campeon c : equipo2) System.out.println(c);

        // Iniciar la batalla
        simularPeleaAleatoria(equipo1, equipo2, rand);
    }

    static boolean equipoSigueVivo(Campeon[] equipo) {
        for (Campeon campeon : equipo) {
            if (campeon.salud > 0) {
                return true;
            }
        }
        return false;
    }

    static Campeon obtenerVivoAleatorio(Campeon[] equipo, Random rand) {
        int vivos = 0;
        for (Campeon campeon : equipo) {
            if (campeon.salud > 0) {
                vivos++;
            }
        }

        if (vivos == 0) {
            return null;
        }

        int indiceAleatorio = rand.nextInt(vivos);
        int contador = 0;
        for (Campeon campeon : equipo) {
            if (campeon.salud > 0) {
                if (contador == indiceAleatorio) {
                    return campeon;
                }
                contador++;
            }
        }

        return null;
    }

    static void simularPeleaAleatoria(Campeon[] equipo1, Campeon[] equipo2, Random rand) {
        while (equipoSigueVivo(equipo1) && equipoSigueVivo(equipo2)) {
            Campeon atacante1 = obtenerVivoAleatorio(equipo1, rand);
            Campeon defensor2 = obtenerVivoAleatorio(equipo2, rand);

            Campeon atacante2 = obtenerVivoAleatorio(equipo2, rand);
            Campeon defensor1 = obtenerVivoAleatorio(equipo1, rand);

            // Determinar tipo de ataque
            boolean ataqueEspecial1 = rand.nextBoolean();
            boolean ataqueEspecial2 = rand.nextBoolean();

            if (atacante1 != null && defensor2 != null) {
                int danio = ataqueEspecial1 ? atacante1.ataque * 2 : atacante1.ataque;
                System.out.println("Equipo 1 - " + atacante1.nombre + " usa " + (ataqueEspecial1 ? "ataque especial" : "ataque básico") +
                        " contra " + defensor2.nombre + " del Equipo 2, causando " + danio + " de daño.");
                defensor2.salud -= danio;
            }

            if (atacante2 != null && defensor1 != null) {
                int danio = ataqueEspecial2 ? atacante2.ataque * 2 : atacante2.ataque;
                System.out.println("Equipo 2 - " + atacante2.nombre + " usa " + (ataqueEspecial2 ? "ataque especial" : "ataque básico") +
                        " contra " + defensor1.nombre + " del Equipo 1, causando " + danio + " de daño.");
                defensor1.salud -= danio;
            }

            if (equipoSigueVivo(equipo1) && !equipoSigueVivo(equipo2)) {
                System.out.println("Equipo 1 gana.");
            } else if (!equipoSigueVivo(equipo1) && equipoSigueVivo(equipo2)) {
                System.out.println("Equipo 2 gana.");
            } else {
                System.out.println("El enfrentamiento continúa.");
            }
        }
    }
}
