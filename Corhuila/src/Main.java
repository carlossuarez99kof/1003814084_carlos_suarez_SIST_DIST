    class Usuario {
        private String nombre;
        private String email;

        public String getNombre() {
            return nombre;
        }

        public String getEmail() {
            return email;
        }

        Usuario(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }

        // Constructor, getters y setters

        public void registrarUsuario() {
            // Lógica para registrar al usuario en la base de datos
            System.out.println("Usuario registrado: " + nombre + " (" + email + ")");
        }

    }

    public class Main {
        public static  void main(String[] args) {
            Usuario usuario = new Usuario("carlos suarez", "carlosSuarez@gmail.com");

            realizarAccionesAntesDelRegistro(usuario.getNombre(), usuario.getEmail());

            // Delega el registro al método dedicado de la clase Usuario
            usuario.registrarUsuario();

            realizarAccionesDespuesDelRegistro(usuario.getNombre(), usuario.getEmail());
        }

        private static void realizarAccionesAntesDelRegistro(String nombre, String gmail) {
            System.out.println("la informacion que se esta registrando es: " + nombre + " " + gmail);
            System.out.println("REGISTRANDO.");
            // Lógica común antes del registro
        }

        private static void realizarAccionesDespuesDelRegistro(String nombre, String gmail) {
            // Lógica común después del registro
            System.out.println("El registro se ha actualizado con exito ." + nombre + " " + "correo: " + gmail);
        }
    }

