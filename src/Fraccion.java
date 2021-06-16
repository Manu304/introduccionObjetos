package src;
/*
Crea una clase Fraccion con métodos para sumar,
restar, multiplicar y dividir fracciones.
*/

import java.util.Scanner;

public class Fraccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeradorIngresa, denominadorIngresa;
        Fraccion fraccion1, fraccion2, sumado, restado, multiplicado, dividido;
        System.out.println("\n-------------INGRESANDO FRACCIONES-----------\n");
        System.out.print("Ingrese el numerador de la primera fraccion: ");
        numeradorIngresa = scanner.nextInt();
        System.out.print("Ingrese el denomidador de la primera fraccion: ");
        denominadorIngresa = scanner.nextInt();
        fraccion1 = new Fraccion(numeradorIngresa, denominadorIngresa);
        System.out.print("\nIngrese el numerador de la segunda fraccion: ");
        numeradorIngresa = scanner.nextInt();
        System.out.print("Ingrese el denominador de la segunda fraccion: ");
        denominadorIngresa = scanner.nextInt();
        fraccion2 = new Fraccion(numeradorIngresa, denominadorIngresa);
        System.out.println("\n------------SUMA DE FRACCIONES--------------\n");
        fraccion1.mostrar();
        System.out.print(" + ");
        fraccion2.mostrar();
        sumado = fraccion1.sumar(fraccion2);
        System.out.print(" = ");
        sumado.mostrar();
        System.out.println("\n------------RESTA DE FRACCIONES--------------\n");
        fraccion1.mostrar();
        System.out.print(" - ");
        fraccion2.mostrar();
        restado = fraccion1.restar(fraccion2);
        System.out.print(" = ");
        restado.mostrar();
        System.out.println("\n---------MULTIPLICACION DE FRACCIONES---------\n");
        fraccion1.mostrar();
        System.out.print(" × ");
        fraccion2.mostrar();
        multiplicado = fraccion1.multiplicar(fraccion2);
        System.out.print(" = ");
        multiplicado.mostrar();
        System.out.println("\n------------DIVISION DE FRACCIONES------------\n");
        fraccion1.mostrar();
        System.out.print(" ÷ ");
        fraccion2.mostrar();
        dividido = fraccion1.dividir(fraccion2);
        System.out.print(" = ");
        dividido.mostrar();
        System.out.println("\n----------------------FIN---------------------\n");
    }

    private int numerador, denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion fraccion2) {
        Fraccion suma;
        int numeradorSuma = (this.numerador * fraccion2.getDenominador())
                + (fraccion2.getNumerador() * this.denominador);
        int denominadorSuma = this.denominador * fraccion2.getDenominador();
        suma = new Fraccion(numeradorSuma, denominadorSuma);
        suma.simplificar();
        return suma;
    }

    public Fraccion restar(Fraccion fraccion2) {
        Fraccion resta;
        int numeradorResta = (this.numerador * fraccion2.getDenominador())
                - (fraccion2.getNumerador() * this.denominador);
        int denominadorResta = this.denominador * fraccion2.getDenominador();
        resta = new Fraccion(numeradorResta, denominadorResta);
        resta.simplificar();
        return resta;
    }

    public Fraccion multiplicar(Fraccion fraccion2) {
        Fraccion multiplicacion;
        int numeradorMultiplica = this.numerador * fraccion2.getNumerador();
        int denomidadorMultiplica = this.denominador * fraccion2.getDenominador();
        multiplicacion = new Fraccion(numeradorMultiplica, denomidadorMultiplica);
        multiplicacion.simplificar();
        return multiplicacion;
    }

    public Fraccion dividir(Fraccion fraccion2) {
        Fraccion division;
        int numeradorDivision = this.numerador * fraccion2.getDenominador();
        int denomidadorDivision = this.denominador * fraccion2.getNumerador();
        division = new Fraccion(numeradorDivision, denomidadorDivision);
        division.simplificar();
        return division;
    }

    public void simplificar() {
        if (numerador % denominador == 0) {
            numerador /= denominador;
            denominador = 1;
        } else if (denominador % numerador == 0) {
            denominador /= numerador;
            numerador = 1;
        } else {
            for (int i = 1; i < 99; i++) {
                if ((numerador % i == 0) && (denominador % i == 0)) {
                    numerador /= i;
                    denominador /= i;
                }
            }
        }
    }

    public void mostrar() {
        if (denominador == 1) {
            System.out.print(numerador);
        } else {
            System.out.print(numerador + "/" + denominador);
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

}