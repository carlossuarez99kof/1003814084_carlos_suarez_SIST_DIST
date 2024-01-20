import hexagonal.hexagonalExample;

public class Main {
    public static void main(String[] args) {

        // Crear el adaptador de base de datos y conectarlo con el núcleo
        hexagonalExample.EmployeeService databaseEmployeeService = new hexagonalExample.DatabaseEmployeeAdapter();

        // Crear el adaptador de interfaz de usuario y conectarlo con el adaptador de base de datos
        hexagonalExample.ConsoleUserInterfaceAdapter consoleUIAdapter = new hexagonalExample.ConsoleUserInterfaceAdapter(databaseEmployeeService);

        // Ahora, puedes interactuar con la aplicación a través del adaptador de interfaz de usuario
        consoleUIAdapter.addEmployeeFromConsole("John Doe", "Software Developer");
        consoleUIAdapter.displayEmployeeInfo(1);
    }
}