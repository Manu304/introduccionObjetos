package src;
/*
202030799 Manuel Rojas
Crea una clase Contador con los métodos para
incrementar y decrementar el contador. La clase
contendrá un constructor por defecto, un
constructor con parámetros, un constructor.
Generar un método getContador para devolver el
monto del contador, y un setContador(contador)
para establecer.
*/

import java.util.Scanner;

public class Contador2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorInicial, aumentar, disminuir;
        Contador2 ejercicio5 = new Contador2();
        System.out.println("\n--------CONTADOR CON CONSTRUCTOR POR DEFECTO--------\n");
        System.out.println("El contador inicial es: " + ejercicio5.getContador());
        System.out.print("Ingrese la cantidad que desea incrementar: ");
        aumentar = scanner.nextInt();
        ejercicio5.incrementarContador(aumentar);
        System.out.println("El contador incrementado es: " + ejercicio5.getContador());
        System.out.print("Ingrese la cantidad que desea decrementar: ");
        disminuir = scanner.nextInt();
        ejercicio5.decrementarContador(disminuir);
        System.out.println("El contador decrementado es: " + ejercicio5.getContador());

        System.out.println("\n-------CONTADOR CON CONSTRUCTOR CON PARAMETROS-------\n");
        System.out.print("Ingrese un valor inicial para el contador: ");
        valorInicial = scanner.nextInt();
        Contador2 ejemplo2 = new Contador2(valorInicial);
        System.out.println("El contador inicial es: " + ejemplo2.getContador());
        System.out.print("Ingrese la cantidad que desea incrementar: ");
        aumentar = scanner.nextInt();
        ejemplo2.incrementarContador(aumentar);
        System.out.println("El contador incrementado es: " + ejemplo2.getContador());
        System.out.print("Ingrese la cantidad que desea decrementar: ");
        disminuir = scanner.nextInt();
        ejemplo2.decrementarContador(disminuir);
        System.out.println("El contador decrementado es: " + ejemplo2.getContador());

        System.out.println("\n-------------CAMBIANDO VALOR DEL CONTADOR-----------\n");
        System.out.print("Ingrese el nuevo valor del contador: ");
        valorInicial = scanner.nextInt();
        ejercicio5.setContador(valorInicial);
        System.out.println("\nSe ha asignado al contador el valor: " + ejercicio5.getContador());
        System.out.println("\n---------------------FIN----------------------------\n");

    }

    private int contador = 0;

    public Contador2() {
    }

    public Contador2(int contador) {
        this.contador = contador;
    }

    public void incrementarContador(int cantidad){
        contador += contador;
    }

    public void decrementarContador(int cantidad){
        contador -= cantidad;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}