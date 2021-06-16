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

public class Contador2 {
    public static void main(String[] args) {

    }

    private int contador = 0;

    public Contador2() {
    }

    public Contador2(int contador) {
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