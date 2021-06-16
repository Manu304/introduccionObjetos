package src;

public class Persona {
    public static void main(String[] args) {

    }

    private String nombre = "";
    private float peso, altura;
    private int edad, dni;
    private char sexo = 'H';

    public Persona() {
        this.dni = generarDNI();
    }

    public Persona(String nombre, float peso, float altura, int edad, char sexo) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni = generarDNI();
    }

    public int calcularIMC() {
        int pesoIdeal = 1;
        float pesoForm = peso / (altura * altura);
        if (pesoForm < 20) {
            pesoIdeal = -1;
        } else if (pesoForm >= 20 && pesoForm <= 25) {
            pesoForm = 0;
        }
        return pesoIdeal;
    }

    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }

    private char comprobarSexo(char sexoComprobar) {
        if (sexoComprobar == 'H' || sexoComprobar == 'M') {
            return sexoComprobar;
        } else {
            return 'H';
        }
    }

    private int generarDNI() {
        return aleatorio(10000000, 99999999);
    }

    private static int aleatorio(int minimo, int maximo) {
        int aleatorio = (int) Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
        return aleatorio;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + "\nNombre: " + nombre + "\nEdad: " + edad + "\nSexo: " + sexo + "\nPeso: " + peso
                + "\nAltura: " + altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}