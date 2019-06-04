/*
1. Los Getter y Setter no son necesarios en kotlin y el acceso a los atributos se hace como obx.nombre="Pepe"
2. Hay dos tipos de constructores, uno donde le definimos los valores
 */
open class Plantilla (var id: Int,var edad: Int,var nombre: String,var apellido: String)  {


    //Métodos
    fun concentrarse() {
        println("Concentrarse a selección")
    }

    open fun viajar() {
        println("Viaxa a selección")
    }

    override fun toString(): String {
        return "Plantilla id=$id, edad=$edad, nombre=$nombre, apellido=$apellido"
    }

}