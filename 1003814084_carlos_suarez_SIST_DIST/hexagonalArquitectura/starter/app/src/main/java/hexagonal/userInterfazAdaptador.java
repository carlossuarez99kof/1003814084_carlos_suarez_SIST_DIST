// Adaptador de interfaz de usuario
public class UserInterfaceAdapter {
    private final UserService userService;

    public UserInterfaceAdapter(UserService userService) {
        this.userService = userService;
    }

    public void createUserFromUI(String username, String password) {
        // Lógica para obtener datos del usuario desde la interfaz de usuario
        userService.createUser(username, password);
    }

    public void displayUserInfo(int userId) {
        // Lógica para mostrar la información del usuario en la interfaz de usuario
        User user = userService.getUserById(userId);
        // Mostrar la información en la interfaz de usuario
    }
}
