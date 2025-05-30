SIMULACIÓN DE LEAGUE OF LEGENDS

Se desea desarrollar un programa en Java que simule una batalla uno contra uno entre dos equipos de campeones de League of Legends, utilizando herencia, polimorfismo, sobrecarga de constructores y manejo de arrays.

CREACIÓN DE CLASE BASE

Se crea una clase base llamada Campeon con atributos y métodos:
  Atributos: nombre (String), rol (String), ataque, defensa, velocidad (int), salud   (int, inicia en 100).
  Métodos: constructor, atacar(), ataqueEspecial(), recibirDanio(int), toString() sobrescrito.

CREACIÓN DE SUBCLASES DEPENDIENDTES DE LA CLASE BASE

  TopLaner: resistencia que reduce daño recibido: danioFinal = danio - (resistencia / 10).
  
  Jungla: controlMapa que suma al ataque especial: ataqueEspecial = super.ataqueEspecial() + (controlMapa / 5).
  
  ADC: rango que aumenta el ataque básico: atacar() = super.atacar() + (rango / 4)
  MidLaner: poderMagico que funciona como escudo: danioFinal = danio - (poderMagico / 8).
  
  Support: curacion que restaura salud al usar ataque especial (máximo 100).

SIMULACIÓN EN EL MAIN

1️) Creación de equipos
   Se instancian dos arreglos (equipo1 y equipo2), cada uno con tres campeones de distintas subclases.
   Se les asignan atributos como ataque, defensa y velocidad.
   Se imprime la salud inicial de cada campeón antes del combate.
2️) Inicio de la batalla
  La función simularPeleaAleatoria() maneja la pelea.
  Se verifica constantemente si ambos equipos tienen al menos un campeón vivo (equipoSigueVivo()).
  Se seleccionan aleatoriamente un atacante y un defensor de cada equipo (obtenerVivoAleatorio()).
  Se decide al azar si el ataque será básico o especial.
3️) Ejecución de ataques
  Los campeones atacan a los oponentes reduciendo su salud.
  Los soportes (Support) pueden optar por curar a sus aliados en lugar de atacar.
  Se muestra la salud restante de los campeones tras cada ataque.
 
  Se usa código ANSI para cambiar el color de los mensajes en la consola:
- Rojo para indicar daño.
- Verde para la salud restante.
- Amarillo para campeones derrotados.
4️) Finalización del combate
  Cuando un equipo pierde todos sus campeones, se declara al equipo ganador con un mensaje en la consola.
  Si aún quedan campeones vivos en ambos equipos, la pelea continúa.


EXPLICACIÓN DE METODOS PRINCIPALES

Estos métodos estructuran la batalla y definen la lógica del combate.
  equipoSigueVivo(Campeon[] equipo)
- Función: Comprueba si algún campeón de un equipo sigue con vida.
- Lógica:
  Recorre el arreglo de campeones.
  Si encuentra un campeón con salud mayor a 0, devuelve true.
  Si todos están derrotados, devuelve false.
    obtenerVivoAleatorio(Campeon[] equipo, Random rand)
- Función: Obtiene un campeón al azar que aún esté vivo.
- Lógica:
  Cuenta cuántos campeones siguen en pie.
  Genera un índice aleatorio entre los que aún tienen salud.
  Retorna el campeón seleccionado.
    simularPeleaAleatoria(Campeon[] equipo1, Campeon[] equipo2, Random rand)
- Función: Administra el combate entre los equipos.
- Lógica:
  Mientras ambos equipos tengan al menos un campeón vivo, continúa la batalla.
  Escoge aleatoriamente un atacante y defensor de cada equipo.
  Decide si el atacante usará un ataque básico o un ataque especial.
  Aplica daño al defensor y muestra la salud restante.
  Si un support ataca, puede optar por curar a un aliado en vez de atacar.
  Si un equipo pierde a todos sus campeones, se declara al ganador.

METODOS DE LA CLASE CAMPEON

Estos métodos controlan las acciones de los campeones.
  atacar()
- Función: Devuelve el daño de un ataque básico.
- Lógica: Cada campeón tiene su nivel de ataque, y algunos campeones pueden modificarlo (por ejemplo, el ADC lo amplifica con su rango).
  ataqueEspecial()
- Función: Ejecuta un ataque más poderoso que el básico.
- Lógica: Generalmente duplica el ataque base, pero algunas subclases modifican este comportamiento (por ejemplo, el Jungla mejora su ataque especial con controlMapa).
    recibirDanio(int danio)
- Función: Reduce la salud del campeón según el daño recibido.
- Lógica:
- Se resta el daño a la salud.
- Algunas subclases aplican resistencia o escudos para mitigar el daño.
    curar(Campeon aliado) [Solo para Support]
- Función: Permite a los campeones Support restaurar salud a sus aliados.
- Lógica:
- Se suma la cantidad de curación al aliado, sin exceder el límite de 100 de salud.

CAPTURAS DEL CODIGO COMPLETO

![image](https://github.com/user-attachments/assets/1ee109a4-e1e7-4486-95e3-db976c875ab6)
