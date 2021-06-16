package src;

/*
Cree una clase cuadrado. Esta clase cuenta con los
métodos de calcular área, calcular perimetro. El
constructor debe de permitir ingresar el tamaño
de un lado.
*/
public class Cuadrado {
    public static void main(String[] args) {

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
