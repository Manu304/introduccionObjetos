package src;
/*
Cree una clase rectangulo. Esta clase cuenta con
los métodos de calcular área, calcular perimetro.
El constructor debe de permitir ingresar ancho y
el largo. Debe verificar que no sean iguales.
*/

public class Rectangulo {
    public static void main(String[] args) {
        
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
