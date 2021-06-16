package src;

import java.util.Scanner;

public class Persona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona persona1, persona2, persona3;
        String nombreI = "";
        float pesoI, alturaI;
        int edadI;
        char sexoI;
        System.out.println("\n--------SOLICITANDO DATOS DE PERSONAS--------\n");
        System.out.print("Ingrese el nombre de la persona: ");
        nombreI = scanner.nextLine();
        System.out.print("Ingrese la edad de la persona: ");
        edadI = scanner.nextInt();
        System.out.print("Ingrese el sexo de la persona: ");
        sexoI = scanner.next().toUpperCase().charAt(0);
        System.out.print("Ingrese la altura de la persona (metros): ");
        alturaI = scanner.nextFloat();
        System.out.print("Ingrese el peso de la persona (kilogramos): ");
        pesoI = scanner.nextFloat();
        persona1 = new Persona(nombreI, pesoI, alturaI, edadI, sexoI);
        persona2 = new Persona(nombreI, edadI, sexoI);
        persona3 = new Persona();
        System.out.println("\n------------COMPROBANDO PESO IDEAL------------\n");
        int persona1IMC = persona1.calcularIMC();
        int persona2IMC = persona2.calcularIMC();
        int persona3IMC = persona3.calcularIMC();
        System.out.println(persona1.getNombre() + " " + mensajePeso(persona1IMC));
        System.out.println(persona2.getNombre() + " " + mensajePeso(persona2IMC));
        System.out.println(persona3.getNombre() + " " + mensajePeso(persona3IMC));
        System.out.println("\n-----------COMPROBANDO MAYORIA DE EDAD---------\n");
        boolean persona1Mayor = persona1.esMayorDeEdad();
        boolean persona2Mayor = persona2.esMayorDeEdad();
        boolean persona3Mayor = persona3.esMayorDeEdad();
        System.out.println(persona1.getNombre() + " " + mensajeEdad(persona1Mayor));
        System.out.println(persona2.getNombre() + " " + mensajeEdad(persona2Mayor));
        System.out.println(persona3.getNombre() + " " + mensajeEdad(persona3Mayor));
        System.out.println("\n--------INFORMACION DE LAS PERSONAS CREADAS------\n");
        System.out.println(persona1 + "\n");
        System.out.println(persona2 + "\n");
        System.out.println(persona3 + "\n");
    }

    private String nombre = "";
    private float peso, altura;
    private int edad, dni;
    private char sexo;

    public Persona(String nombre, float peso, float altura, int edad, char sexo) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, 0, 0, edad, sexo);
    }

    public Persona() {
        this(" ", 0, 'H');
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

    public static String mensajePeso(int IMC) {
        String mensaje;
        if (IMC == -1) {
            mensaje = "Está en su peso ideal";
        } else if (IMC == 0) {
            mensaje = "Está por debajo de su peso ideal";
        } else {
            mensaje = "Tiene sobrepeso";
        }
        return mensaje;
    }

    public static String mensajeEdad(boolean mayor) {
        String mensaje;
        if (mayor == true) {
            mensaje = "Es mayor de edad";
        } else {
            mensaje = "Es menor de edad";
        }
        return mensaje;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + "\nNombre: " + nombre + "\nEdad: " + edad + "\nSexo: " + sexo + "\nPeso: " + peso + " kg"
                + "\nAltura: " + altura + " m";
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