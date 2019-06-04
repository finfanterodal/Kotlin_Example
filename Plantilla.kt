/*
1. Los Getter y Setter no son necesarios en kotlin y el acceso a los atributos se hace como obx.nombre="Pepe"
2. Hay dos tipos de constructores, uno donde le definimos los valores
 */
open class Plantilla {


    var id: Int = 0
    var edad: Int = 0
    var nombre: String? = null
    var apellido: String? = null
    //Constructores

    constructor() {}
    //Constructor secundario
    constructor(id: Int, edad: Int, nombre: String, apellido: String) {
        this.id = id
        this.edad = edad
        this.nombre = nombre
        this.apellido = apellido
    }

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