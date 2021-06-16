package src;
/*
Cree una clase llamada Principal. Como se
muestra en la siguiente slide. En la cual deberá
hacer el llamado de los ejercicios del 1 al 7.
a. Debe crear al menos un objeto de cada ejercicio.
b. Crear una segunda variable del tipo del objeto y
para mostrar el objeto debe utilizar la primera
y para modificarlo la segunda
i. Objetivo demostrar que solo apuntan al
objeto las variables
*/

public class Principal {
    public static void main(String[] args) {
        
    }
    Contador ejercicio1 = new Contador();
    Cuadrado ejercicio2 = new Cuadrado(2.5);
    Circulo ejercicio3 = new Circulo(3);
    Rectangulo ejercicio4 = new Rectangulo(4, 3);
    Contador2 ejercicio5 = new Contador2();
    Libro ejercicio6 = new Libro();
    Fraccion ejercicio7 = new Fraccion(1, 2);
    
    public Principal() {
        
    }
    
}
