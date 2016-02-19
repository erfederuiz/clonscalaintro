package org.hablapps.curso.genericidad

// 0. Partimos de una versión reducida de la lista generada en el módulo
// anterior.

// sealed trait Lista
//
// case class Cons(cabeza: Int, resto: Lista = Nada()) extends Lista
//
// case class Nada() extends Lista

// 1. Generalizamos sobre `Int` añadiendo parámetro tipo `A`

// sealed trait Lista[A]
//
// case class Cons[A](cabeza: A, resto: Lista[A] = Nada[A]()) extends Lista[A]
//
// case class Nada[A]() extends Lista[A]

// 2. Hacemos polimórfico el método `apply` de creación de listas.

sealed trait Lista[+A] {
  def contiene[A1 >: A](a: A1): Boolean = ???
}

object Lista {
  def apply[A](as: A*): Lista[A] =
    if (as.isEmpty)
      Nada[A]()
    else
      Cons[A](as.head, apply(as.tail: _*))
}

case class Cons[A](cabeza: A, resto: Lista[A] = Nada[A]()) extends Lista[A]

case class Nada[A]() extends Lista[A]

// 3. Probamos que nuestra lista es invariante y posteriormente la convertimos
// en covariante.

// 4. Problema al implementar método contains. Solucionado con type bound.
