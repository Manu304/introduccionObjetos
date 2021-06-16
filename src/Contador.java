package src;
/*
202030799 Manuel Rojas
Crea una clase Contador con los métodos
para incrementar y decrementar el
contador. La clase contendrá un
constructor por defecto, un constructor
con parámetros, un constructor copia y
los métodos getters y setters.
*/

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contador ejercicio1 = new Contador();
        System.out.println("\n--------CONTADOR CON CONSTRUCTOR POR DEFECTO--------\n");
        System.out.println("El contador inicial es: " + ejercicio1.getContador());
        ejercicio1.incrementarContador();
        System.out.println("El contador incrementado es: " + ejercicio1.getContador());
        ejercicio1.decrementarContador();
        System.out.println("El contador decrementado es: " + ejercicio1.getContador());

        System.out.println("\n-------CONTADOR CON CONSTRUCTOR CON PARAMETROS-------\n");
        System.out.print("Ingrese un valor inicial para el contador: ");
        int valorInicial = scanner.nextInt();
        Contador ejemplo2 = new Contador(valorInicial);
        System.out.println("El contador inicial es: " + ejemplo2.getContador());
        ejemplo2.incrementarContador();
        System.out.println("El contador incrementado es: " + ejemplo2.getContador());
        ejemplo2.decrementarContador();
        System.out.println("El contador decrementado es: " + ejemplo2.getContador());

        System.out.println("\n-------------CAMBIANDO VALOR DEL CONTADOR-----------\n");
        System.out.print("Ingrese el nuevo valor del contador: ");
        int nuevoValor = scanner.nextInt();
        ejercicio1.setContador(nuevoValor);
        System.out.println("\nSe ha asignado al contador el valor: " + ejercicio1.getContador());
        System.out.println("\n---------------------FIN----------------------------\n");
    }

    private int contador;

    public Contador() {
        this.contador = 0;
    }

    public Contador(int contador) {
        this.contador = contador;
    }

    public void incrementarContador() {
        contador++;
    }

    public void decrementarContador() {
        contador--;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}