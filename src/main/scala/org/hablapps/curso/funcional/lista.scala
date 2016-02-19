package org.hablapps.curso.funcional

// 1. Crear estructura propia para poder trabajar con listas.

// sealed trait Lista
//
// class Cons(cabeza: Int, resto: Lista) extends Lista
//
// class Nada() extends Lista

// 2. Añadimos un método para insertar un nuevo elemento en la lista (por la
// cabeza)

// sealed trait Lista {
//   def insertar(c: Int): Lista = {
//     new Cons(c, this)
//   }
// }
//
// class Cons(val cabeza: Int, val resto: Lista) extends Lista
//
// class Nada() extends Lista

// 3. Convertimos nuestras clases en "case" y añadimos el método `suma`, que
// suma todos los elementos de la lista, o devuelve 0 en caso de que la lista
// sea vacía.

// sealed trait Lista {
//
//   def insertar(c: Int): Lista = {
//     new Cons(c, this)
//   }
//
//   def suma: Int = {
//     this match {
//       case Nada() => 0
//       case Cons(c, r) => c + r.suma
//     }
//   }
// }
//
// case class Cons(val cabeza: Int, val resto: Lista) extends Lista
//
// case class Nada() extends Lista

// 4. Añadimos el método `map` que recibe una lambda (Int => Int) para mapear
// todos los elementos de esta lista.

sealed trait Lista {

  def insertar(c: Int): Lista = {
    new Cons(c, this)
  }

  def suma: Int = {
    this match {
      case Nada() => 0
      case Cons(c, r) => c + r.suma
    }
  }

  def map(f: Int => Int): Lista = {
    this match {
      case Nada() => this
      case Cons(c, r) => Cons(f(c), r.map(f))
    }
  }
}

case class Cons(val cabeza: Int, val resto: Lista) extends Lista

case class Nada() extends Lista
