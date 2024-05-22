open class Usuario {
    var nombre:String = ""
    var apellido:String = ""
    var dni:String = ""
    var email:String =""
    var telefono:String = ""
    var domicilio:String = ""

    constructor(
        nombre: String,
        apellido: String,
        dni: String,
        email: String,
        telefono: String,
        domicilio: String
    ) {
        this.nombre = nombre
        this.apellido = apellido
        this.dni = dni
        this.email = email
        this.telefono = telefono
        this.domicilio = domicilio
    }
}
