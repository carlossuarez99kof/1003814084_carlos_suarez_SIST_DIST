// Puerto (interfaz)
public interface UserService {
    void createUser(String username, String password);
    User getUserById(int userId);
    // Otros métodos relacionados con usuarios
}