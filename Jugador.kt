class Jugador(
    private var dorsal: Int,
    private var demarcacion:String,
    id: Int,
    edad: Int,
    nombre: String,
    apellido: String) : Plantilla(id, edad, nombre, apellido){


    fun jugarPartido(){
    println("Jugar Partido Jugador")
    }

    fun entrenar(){
        println("Entrenar Jugador")
    }

   override fun viajar(){
        super.viajar()
        println("Viajar Masajista")
    }

   override fun toString():String{
        return "Judador dorsal: $dorsal, demarcacion: $demarcacion"
    }
}