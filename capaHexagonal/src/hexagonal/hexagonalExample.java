package hexagonal;

public class hexagonalExample {

    static Employee guardado = null;

    // Núcleo de la aplicación
    public static class Employee {
        private int employeeId;
        private String name;
        private String position;

        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }
    }

    public static class userDTO{
        private String user;
        private String posicion;

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getPosicion() {
            return posicion;
        }

        public void setPosicion(String posicion) {
            this.posicion = posicion;
        }
    }

    public interface EmployeeService {
        void addEmployee(String name, String position);
        userDTO getEmployeeById(int employeeId);

    }

    // Adaptador de base de datos
    public static class DatabaseEmployeeAdapter implements EmployeeService {
        @Override
        public void addEmployee(String name, String position) {
            Employee user = new Employee();
            user.setName(name);
            user.setEmployeeId(1);
            user.setPosition(position);
            //guardamos usuario
            guardado = user;
        }

        @Override
        public userDTO getEmployeeById(int employeeId) {
            if(employeeId != 0){
                userDTO response = new userDTO();
                response.setPosicion(guardado.getPosition());
                response.setUser(guardado.getName());
                return response;
            }
            return null;
        }
    }

    // Adaptador de interfaz de usuario (consola en este caso)
    public static class ConsoleUserInterfaceAdapter {
        private final EmployeeService employeeService;

        public ConsoleUserInterfaceAdapter(EmployeeService employeeService) {
            this.employeeService = employeeService;
        }

        public void addEmployeeFromConsole(String name, String position) {
            // Lógica para obtener datos del empleado desde la consola
            employeeService.addEmployee(name, position);
            System.out.println("Empleado agregado exitosamente." + " " + guardado.getName() + " " + guardado.getPosition());
        }

        public void displayEmployeeInfo(int employeeId) {
            // Lógica para mostrar la información del empleado en la consola
            userDTO employee = employeeService.getEmployeeById(employeeId);
            System.out.println("Información del empleado: " + employee.user + employee.posicion);
        }
    }
}
