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

    public Fraccion sumar(Fraccion fraccion2){
        Fraccion sumada;
        int numeradorSuma = (this.numerador*fraccion2.getDenominador()) + (this.denominador*fraccion2.getNumerador());
        int denominadorSuma = this.denominador*fraccion2.getDenominador();
        if ((numeradorSuma%denominadorSuma) == 0) {
            numeradorSuma /= denominadorSuma;
        }else if((denominadorSuma%numeradorSuma) == 0){
            numeradorSuma = 1;
            denominadorSuma /= numeradorSuma;  
        }

        sumada = new Fraccion(numeradorSuma, denominadorSuma);
        return sumada;
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
