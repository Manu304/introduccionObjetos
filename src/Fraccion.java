package src;
/*
Crea una clase Fraccion con métodos para sumar,
restar, multiplicar y dividir fracciones.
*/

public class Fraccion {
    public static void main(String[] args) {
        
    }
    private int numerador, denominador;
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
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
