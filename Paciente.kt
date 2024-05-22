import Usuario

class Paciente (
    nombre: String,
    apellido: String,
    dni: String,
    email: String,
    telefono: String,
    domicilio: String,
    nroPac:Int
) : Usuario(nombre, apellido, dni, email, telefono, domicilio) {
    var nroPac: Int = -1
}