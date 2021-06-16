package src;
/*
Cree una clase rectangulo. Esta clase cuenta con
los métodos de calcular área, calcular perimetro.
El constructor debe de permitir ingresar ancho y
el largo. Debe verificar que no sean iguales.
*/

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double anchoRec, largoRec;
        System.out.println("\n-------------CREANDO OBJETO RECTANGULO-----------\n");
        do {
            System.out.print("Ingrese el ancho del rectangulo: ");
            anchoRec = scanner.nextDouble();
            System.out.print("Ingrese el largo del rectangulo: ");
            largoRec = scanner.nextDouble();
            if (anchoRec == largoRec) {
                System.out.println("El ancho no puede ser igual al largo!");
            }
            if ((anchoRec < 0) || (largoRec < 0)) {
                System.out.println("No puedes ingresar valores negativos");
            }
        } while ((anchoRec == largoRec) || (anchoRec < 0) || (largoRec < 0));
        Rectangulo ejercicio4 = new Rectangulo(anchoRec, largoRec);
        System.out.println("Rectangulo creado!");
        System.out.println("\n------------CALCULANDO AREA Y PERIMETRO----------\n");
        System.out.println("Area del rectangulo: " + ejercicio4.getArea());
        System.out.println("Perimetro del rectangulo: " + ejercicio4.getPerimetro());
        System.out.println("\n---------------------FIN-------------------------\n");        
    }

    private double ancho, largo;

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getArea(){
        return ancho*largo;
    }

    public double getPerimetro(){
        return (2*ancho) + (2*largo);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    

}
