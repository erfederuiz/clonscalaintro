package org.hablapps.curso.oo

object Ejercicios extends App {

  object Ejercicio1 {
    // Extiende el trait Fruta, añadiendo un método 'precio' sin implementación
    // asociada, que no recibe ningún argumento y que devuelve un Double como
    // salida. Toma el método `color` como referencia.
    trait Fruta {
      def color: String
      ???
    }
  }

  object Ejercicio2 {
    import Ejercicio1.Fruta
    // A continuación aparece el Companion Object para el trait `Fruta` que
    // creamos en el primer ejercicio. Implementa el método `crear`, que crea
    // una `Fruta`, valiéndose del `_color` recibido como argumento y fijando el
    // precio a 3.0. Recuerda que un trait no tiene constructores, por lo que
    // tendrás que utilizar la sintaxis de clases anónimas para poder crear una
    // instancia. `new Fruta { ... }`
    object Fruta {
      def crear(_color: String): Fruta = ???
    }
  }

  object Ejercicio3 {
    import Ejercicio1.Fruta
    // Extiende la clase `Platano`, para que herede de `Fruta`, fijando el
    // método `color` a "amarillo" y recibiendo el precio en el constructor.
    class Platano
  }

  object Ejercicio4 {
    import Ejercicio2.Fruta, Ejercicio3.Platano
    // Crea una fruta de cualquier color y un plátano de cualquier precio.
    // Imprime por pantalla el precio de la fruta (debería ser 3.0) y el color
    // del plátano (debería ser "amarillo")
    val fruta   = ???
    val platano = ???
    println("El precio de la fruta es: " + ???)
    println("El color del plátano es: "  + ???)
  }
}
