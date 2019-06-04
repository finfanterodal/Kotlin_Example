
class Masajista (
    private var titulacion: String,
    private var aniosExperiencia: Int,
    id: Int,
    edad: Int,
    nombre: String,
    apellido: String
) : Plantilla(id, edad, nombre, apellido) {


    fun darMasaje() {
    println("Dar Masaje.")
    }

    override fun viajar() {
        super.viajar() //To change body of generated methods, choose Tools | Templates.
        println("Viaxa o masajista.")
    }

    //toString

    override fun toString(): String {
        return "Masajista{titulacion=$titulacion, aniosExperiencia=$aniosExperiencia}"
    }

}
