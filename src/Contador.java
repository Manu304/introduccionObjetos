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

public class Contador {
    public static void main(String[] args) {
        Contador ejercicio1 = new Contador();

    }
    private int contador = 0;

    public Contador(){

    }

    public Contador(int contador) {
        this.contador = contador;
    }

    public void incrementarContador(){
        contador++;
    }

    public void decrementarContador(){
        contador--;
    }

    public int getContador() {
        return contador;
    }
    public void setContador(int contador) {
        this.contador = contador;
    }
    
}