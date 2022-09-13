package com.example.funcionesyclases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //arrays()
        //seguridadNula()
        // funciones()
        clases()
    }


  fun arrays() {
    val nombre = "Carlos"
    val apellido = "Jiménez"
    val departamento = "Chalatenango"
    val edad = "32"


    //crear el arreglo
    val miArreglo = arrayListOf<String>()


    //Agregamos las variables que asignamos arriba
     miArreglo.add(nombre)
     miArreglo.add(apellido)
     miArreglo.add(departamento)
     miArreglo.add(edad)

    println(miArreglo)

    //Añadir un conjunto de datos

    miArreglo.addAll(listOf("Estudiantes","Programación IV"))
    println(miArreglo)

    //Acceso a datos
    var miDepart = miArreglo[2]
    println(miDepart)


    //modificar
    miArreglo[0] = "Kemberly"
    println(miArreglo[0])

    //Eliminar
    miArreglo.removeAt(2)
    println(miArreglo)

    miArreglo.forEach {
        println(it)
    }

    //Otras operaciones
    println(miArreglo.count())
    miArreglo.clear()
    println(miArreglo.count())
}


    //Seguridad contra nulas(null safety)
  fun seguridadNula()  {

      var miString:String = "Programación IV 13/09/2022"
        //miString = null; Esto daría error de compilación
        println(miString)


        //variable, seguridad nula (null safety)
        var  miSeguridadNula:String? = "valor de seguridad nula"
        miSeguridadNula = null
        println(miSeguridadNula)

        miSeguridadNula = "Le volvemos a dar un valor"
        println(miSeguridadNula)

        if (miSeguridadNula != null) {
            println(miSeguridadNula.toString()!!)
        }else {
            println(miSeguridadNula.toString())

        }
        println(miSeguridadNula?.length)
        miSeguridadNula?.let {

            println(it.toString())

        }?: kotlin.run {

            println(miSeguridadNula)
        }
  }

    fun funciones() {
        decirHola()
        decirHola()
        decirHola()
        decirNombre( "Nancy" )
        decirNombreyEdad("Carlos" ,21 )

        var sumResultado = sumarDosNum( 2,9)
        println(sumResultado)

    }

    //Función simple
    fun  decirHola() {
       println( "Hola Estudiantes")
    }

    //Función con parametros de entrada
    fun  decirNombre(nombre:String)  {
        println("Hola tu nombre es $nombre")

    }
    fun  decirNombreyEdad(nombre:String, edad:Int)  {
        println("Hola tu nombre es $nombre y tu edad es $edad años" )
    }

    fun sumarDosNum (num1:Int,num2:Int):Int {

        var suma = num1+num2
        return suma
    }


    fun clases(){

        val persona1 = Estudiante("Carlos",20, arrayOf(Estudiante.lengua.Java,Estudiante.lengua.JavaScrip))
        println(persona1.nombre)
        persona1.edad = 21
        println(persona1.codigo())

        val persona2 = Estudiante("Nancy", 25, arrayOf(Estudiante.lengua.Python,Estudiante.lengua.Php),
            arrayOf(persona1)
        )
        println(persona2.nombre)
        print(persona2.codigo())

        println("${persona2.amigo?.first()?.nombre} es amigo de ${persona2.nombre}")

    }
}