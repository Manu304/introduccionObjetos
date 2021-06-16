package src;
/*
Cree una clase circulo. Esta clase debe tener
métodos como calcular el área y el perimetro.
*/

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radioIngresado;
        System.out.println("\n-------------CREANDO OBJETO CIRCULO-----------\n");
        do {
            System.out.print("Ingrese el radio del circulo: ");
            radioIngresado = scanner.nextDouble();
            if (radioIngresado < 0) {
                System.out.println("No puedes ingresar un radio negativo!\n");
            }
        } while (radioIngresado < 0);
        Circulo ejercicio3 = new Circulo(radioIngresado);
        System.out.println("Circulo de radio " + ejercicio3.getRadio() + " creado!");
        System.out.println("\n------------CALCULANDO AREA Y PERIMETRO----------\n");
        System.out.println("Area del circulo: " + ejercicio3.getArea());
        System.out.println("Perimetro del circulo: " + ejercicio3.getPerimetro());
        System.out.println("\n---------------------FIN-------------------------\n");
    }

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    public double getPerimetro() {
        return Math.PI * radio * 2;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}