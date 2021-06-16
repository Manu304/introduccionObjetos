package src;
/*
Cree una clase circulo. Esta clase debe tener
métodos como calcular el área y el perimetro.
*/

public class Circulo {
    public static void main(String[] args) {
        Circulo ejercicio3 = new Circulo(2);
        
    }
    private double radio;

    
    public Circulo(float radio) {
        this.radio = radio;
    }

    public double getArea(){
        return Math.PI*radio*radio;
    }

    public double getPerimetro(){
        return Math.PI*radio*2;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    

    
    
    
}
