public interface FiguraGeometrica {
    double calcularArea();
}

public class Cuadrado implements FiguraGeometrica {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

public class Triangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

public class Circulo implements FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14159265359;
        return pi * (radio * radio);
    }
}

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);
        Triangulo triangulo = new Triangulo(3, 4);
        Circulo circulo = new Circulo(2);

        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}
