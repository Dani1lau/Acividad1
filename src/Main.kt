//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Constantes {
    companion object {
        const val PI = 3.14159
    }
}
var edad: Int? = 25
fun saludar(nombre: String, saludo: String = "HOLII") {
    println("$saludo $nombre")
}
fun main() {
    val count: Int = 10
    println("El valor guardado en la variable count = $count.")
    var nombre: String = "Sofia"
    nombre = "Petunia"
    println("El nombre guardado es = $nombre")
    println("El valor de PI es: ${Constantes.PI}")
    if (edad != null)
        println("La edad es $edad")
    } else {
        println("null")
    }
    saludar("Tulio", "Quemass¡¡¡")
    saludar("Julia", "Quiubo")
}