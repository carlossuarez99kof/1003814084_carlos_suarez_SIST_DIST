// Adaptador de base de datos
public class DatabaseUserAdapter implements UserService {
    @Override
    public void createUser(String username, String password) {
        // Lógica para almacenar el usuario en la base de datos
    }

    @Override
    public User getUserById(int userId) {
        // Lógica para recuperar el usuario desde la base de datos
        return null;
    }
}
