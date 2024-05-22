class Doctor (
    nombre: String,
    apellido: String,
    dni: String,
    email: String,
    telefono: String,
    domicilio: String,
    nroDoc: Int,
    matricula: String
) : Usuario(
    nombre, apellido, dni, email, telefono, domicilio
) {
    var nroDoc: Int = -1
    var matricula: String = ""
}