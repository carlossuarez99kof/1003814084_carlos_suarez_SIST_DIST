Parte 3: Responda a:        
Define el propósito de la clase base FiguraGeometrica y explica cómo contribuye a la
aplicación del Principio de Abierto/Cerrado (OCP).       
¿Cómo se aplica el Principio de Responsabilidad Única (SRP) en cada clase derivada
(cuadrado, triángulo, circunferencia) en relación con el cálculo del área?       
Imagina que se desea agregar una nueva figura geométrica, un hexágono, al sistema.
¿Cómo podrías implementar esta adición siguiendo el Principio de
Abierto/Cerrado (OCP)?

**Propósito de la clase base FiguraGeometrica y su contribución al Principio de Abierto/Cerrado (OCP):

La clase base FiguraGeometrica tiene como propósito generar un metodo de abstraccion comun una para todas las figuras geométricas. Su contribución al Principio de Abierto/Cerrado (OCP)es  su capacidad para ser extendida sin necesidad de modificar el código fuente existente.

El OCP establece que una clase debe estar abierta para la extensión pero cerrada para la modificación. Al tener una clase base que define comportamientos genéricos y propiedades comunes, podemos extenderla con nuevas clases derivadas para agregar funcionalidades específicas a cada figura geométrica sin cambiar la implementación de la clase base.

Aplicación del Principio de Responsabilidad Única (SRP) en clases derivadas:

En relación con el cálculo del área, cada clase derivada (cuadrado, triángulo, circunferencia) debería seguir el Principio de Responsabilidad Única (SRP). Esto nos dice que cada clase debe tener una única razón para cambiar.

Cuadrado: La clase cuadrado debe ser responsable únicamente del cálculo del área para un cuadrado. 

Triángulo: Similarmente, la clase triángulo debe ser responsable solo del cálculo del área para un triángulo.

Circunferencia: La clase circunferencia se encargará solo del cálculo del área para una circunferencia.

y esto seria la explcicacion