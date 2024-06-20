package builder.Build;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Usuario u1 = Usuario.crearUsuario("JOSUE", "ABCD")
        .nombre("Josue")
        .apellido("Lopez")
        .direccion("Calle 123")
        .telefono("1234567890")
        .email("jlopez2748@uta.edu.ec")
        .contact()
        .metodoPago(MetodoPago.PAYPAL)
        .token("1234567890")
        .build();

        System.out.println(u1);
    }
}
