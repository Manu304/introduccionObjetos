package src;

import java.util.Scanner;

/*
Cree una clase cuadrado. Esta clase cuenta con los
métodos de calcular área, calcular perimetro. El
constructor debe de permitir ingresar el tamaño
de un lado.
*/
public class Cuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor;
        System.out.println("\n-------------CREANDO OBJETO CUADRADO------------\n");
        do {
            System.out.print("Ingrese el lado del cuadrado: ");
            valor = scanner.nextDouble();
            if (valor < 0) {
                System.out.println("No puedes ingresar un valor negativo\n");
            }
        } while (valor < 0);
        Cuadrado ejercicio2 = new Cuadrado(valor);
        System.out.println("Se ha creado el cuadrado de lado " + ejercicio2.getLado());
        System.out.println("\n------------CALCULANDO AREA Y PERIMETRO----------\n");
        System.out.println("Area del cuadrado: " + ejercicio2.getArea());
        System.out.println("Perimetro del cuadrado: " + ejercicio2.getPerimetro());
        System.out.println("\n---------------------FIN-------------------------\n");
    }

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getPerimetro(){
        return 4*lado;
    }

    public double getArea(){
        return lado*lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
