# Introducción a Scala

Este repositorio contiene el material utilizado durante el curso de introducción a Scala impartido por Habla Computing:

http://www.hablapps.com/#scala-101-es

En este documento también se recogen instrucciones relativas a la instalación de software, y otros aspectos necesarios para el correcto seguimiento del curso.

## Material del curso

Las explicaciones durante el curso alternarán el uso de transparencias y ejemplos de programación "en vivo". Las diapositivas están disponibles en el siguiente enlace:

[Introducción a Scala](IntroduccionAScala.pdf)

Tanto el código "en vivo" generado durante la sesión como los ejercicios
resueltos podrán encontrarse disponibles en este repositorio al finalizar el curso.

## Clonación del repositorio

Para poder seguir las explicaciones del curso será necesario clonar el repositorio localmente (instalando previamente [git](https://git-scm.com/)):

```bash
$ git clone https://github.com/<<vuestrousuario>>/scalaintrocourse.git
```

Durante la sesión, el repositorio será actualizado varias veces (concretamente
al finalizar cada módulo), con el objetivo de sincronizar los fuentes del
profesor con los del alumno. Para traer los últimos cambios a nuestra copia
local será necesario ejecutar la orden:

```bash
$ cd scalaintrocourse
$ git pull
```

## Instalación de software

#### Librerías de Scala y compilador

Este repositorio contiene una copia de `sbt`, la herramienta de construcción más popular en Scala. Una vez clonado localmente el repositorio, mediante el siguiente comando se descargarán todas las dependencias necesarias para compilar los programas del curso (principalmente, el propio compilador de Scala):  

```bash
$ cd scalaintrocourse
$ ./sbt ~update
```

Se recomienda ejecutar este comando antes de venir al curso para evitar saturaciones en la red inalámbrica y porque es un proceso que puede tardar varios minutos en finalizar.

#### Editores

Con respecto al editor, durante las sesiones del curso utilizaremos
[Atom](https://atom.io/), pero, por supuesto, podéis elegir cualquier otro
editor (Sublime, VI, EMACS) ya que únicamente lo explotaremos como *syntax
highlighter*, delegando las tareas de construcción a una shell donde tendremos
corriendo SBT. El alumno también es libre de utilizar algún IDE (eclipse,
intellij, ENSIME, etc. - véase el paso 3 [de este
enlace](http://www.scala-lang.org/download/) para más información) de su
elección, aunque se preferirá el trabajo en texto plano junto con SBT por los
fines meramente didácticos perseguidos.

## Comunicación

#### Correo electrónico

El correo electrónico del profesor es: [jesus.lopez@hablapps.com](mailto:jesus.lopez@hablapps.com)

#### Twitter

El hashtag "oficial" del curso es el siguiente: `#lightningscalacourse`

## Localización y fecha

El curso tendrán lugar el viernes 19 de febrero, en horario de 16:00 a 21:00 horas, en la sala 1.1.A.01 situada en la primera planta del [Parque Tecnológico de la UC3M](https://www.google.com/maps?q=Parque+Tecnol%C3%B3gico,+Av+Gregorio+Peces+Barba,+28919+Legan%C3%A9s,+Madrid).

El usuario y la constraseña de la red WIFI son las siguientes:
* Usuario: hablapps
* Constraseña: `Dici@18.`       (punto final incluido)
