package com.example.funcionesyclases

class Estudiante(val nombre:String,var edad:Int,val lenguajes:Array< lengua>,val amigo:Array<Estudiante>? = null) {


    enum class lengua  {

        Kotlin,
        Php,
        Java,
        JavaScrip,
        Python

    }

    fun codigo() {
        for (lenguaje:lengua in lenguajes) {
            println("Los lenguajes de programación que conoces son: $lenguajes")

        }
    }
}