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

    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float perimetro(){
        return 4*lado;
    }

    public float area(){
        return lado*lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

}
