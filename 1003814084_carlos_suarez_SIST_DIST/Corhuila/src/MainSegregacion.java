


    // Refactorización de la interfaz según el principio de segregación
    interface Trabajo {
        void trabajar();
    }

    interface TiempoComida {
        void comer();
    }

    interface Descanso {
        void descansar();
    }

    // Clase que implementa las interfaces segregadas
    class NuevoEmpleado implements Trabajo, TiempoComida, Descanso {
        @Override
        public void trabajar() {
            System.out.println("El nuevo empleado está trabajando.");
        }

        @Override
        public void comer() {
            System.out.println("El nuevo empleado está comiendo en su tiempo de descanso.");
        }

        @Override
        public void descansar() {
            System.out.println("El nuevo empleado está descansando.");
        }
    }


