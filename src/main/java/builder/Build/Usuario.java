package builder.Build;

public class Usuario {

    // Quiero hacer una clase builder para esta clase Usuario

    private String user;
    private String password;

    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;

    private boolean contact = false;
    private String token;
    private MetodoPago pago;

    private Usuario(String username, String contrasena) {
        this.user = username;
        this.password = contrasena;
        this.contact = false;
    }

    public static Usuario crearUsuario(String username, String contrasena) {
        return new Usuario(username, contrasena);
    }

    public Usuario nombre(String nombre) {
        this.nombre = nombre;
        return this;

    }

    public Usuario apellido(String apellido) {
        this.apellido = apellido;
        return this;

    }

    public Usuario direccion(String direccion) {
        this.direccion = direccion;
        return this;

    }

    public Usuario telefono(String telefono) {
        this.telefono = telefono;
        return this;

    }

    public Usuario email(String email) {
        this.email = email;
        return this;

    }

    public Usuario contact() {
        if (this.email != null && this.telefono != null && this.direccion != null)
            this.contact = true;
        return this;

    }

    public Usuario metodoPago(MetodoPago pago) {
        if (this.contact == false) {
            // si no hay contacto de info no me deje agregar metodo de pago
            System.out.println("No se puede agregar metodo de pago sin informacion de contacto");
            return this;
        } else {
            this.pago = pago;
            return this;
        }

    }

    public Usuario token(String token) {

        if (this.pago == null) {
            // si no hay metodo de pago no me deje agregar token
            System.out.println("No se puede agregar token sin metodo de pago");
            return this;
        } else {
            if (this.pago == MetodoPago.PAYPAL) {
                this.token = token;
                return this;

            } else {
                System.out.println("No se puede agregar token sin metodo de pago PAYPAL");
                return this;
            }
        }
    }

    public Usuario build() {
        return this;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono="
                + telefono + ", email=" + email + '}';
    }

    // public static class UsuarioBuilder {
    // private Usuario usuario;

    // public UsuarioBuilder() {
    // this.usuario = new Usuario();
    // }

    // public UsuarioBuilder nombre(String nombre) {
    // this.usuario.setNombre(nombre);
    // return this;
    // }

    // public UsuarioBuilder apellido(String apellido) {
    // this.usuario.setApellido(apellido);
    // return this;
    // }

    // public UsuarioBuilder direccion(String direccion) {
    // this.usuario.setDireccion(direccion);
    // return this;
    // }

    // public UsuarioBuilder telefono(String telefono) {
    // this.usuario.setTelefono(telefono);
    // return this;
    // }

    // public UsuarioBuilder email(String email) {
    // this.usuario.setEmail(email);
    // return this;
    // }

    // public Usuario build() {
    // return this.usuario;
    // }
    // }

}
