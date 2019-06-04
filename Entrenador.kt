//Clase entrenador con constructor primario
//Al poder crear las variables en el constructor a la hora de crear la clase, inicializando la variable a 0 ya establcemos que esta no la va a tener.
class Entrenador (private var idFederacion: String, id: Int, edad: Int, nombre: String, apellido: String
) : Plantilla(id, edad, nombre, apellido) {

    //Podemos utilizar este init para inicializar o cambiar variables.
    init {

    }

    fun dirigirPartido() {
        println("Dirigir partido")
    }

    fun dirigirEntrenamiento() {
    println("Dirigir entrenamiento")
    }

    override fun viajar() {
        super.viajar() //To change body of generated methods, choose Tools | Templates.
        println("Viaxa o entrenador.")
    }



    override fun toString(): String {
        return "Entrenador idFederacion=$idFederacion "
    }

}