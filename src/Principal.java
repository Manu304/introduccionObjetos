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
        Principal ej8 = new Principal();
        System.out.println("\n------------CREANDO OBJETO TIPO CONTADOR1---------\n");
        System.out.println("Contador valor inicial: " + ej8.getEjercicio1().getContador());
        System.out.println("\n------------CREANDO OBJETO TIPO CUADRADO----------\n");
        System.out.println("Cuadrado lado: " + ej8.getEjercicio2().getLado());
        System.out.println("\n------------CREANDO OBJETO TIPO CIRCULO-----------\n");
        System.out.println("Circulo radio: " + ej8.getEjercicio3().getRadio());
        System.out.println("\n------------CREANDO OBJETO TIPO CONTADOR2---------\n");
        System.out.println("Contador2 valor inicial: " + ej8.getEjercicio5().getContador());
        System.out.println("\n------------CREANDO OBJETO TIPO LIBRO-------------\n");
        ej8.getEjercicio6().mostrarInformacion();
        System.out.println("\n------------CREANDO OBJETO TIPO FRACCION-----------\n");
        System.out.print("Fraccion: ");
        ej8.getEjercicio7().mostrar();
        System.out.println("\n");

    }
    Contador ejercicio1;
    Cuadrado ejercicio2;
    Circulo ejercicio3;
    Rectangulo ejercicio4;
    Contador2 ejercicio5;
    Libro ejercicio6;
    Fraccion ejercicio7;
    
    public Principal() {
        ejercicio1 = new Contador();
        ejercicio2 = new Cuadrado(3);
        ejercicio3 = new Circulo(1.5);
        ejercicio4 = new Rectangulo(2.3, 4); //primera variable
        ejercicio5 = new Contador2(5);
        ejercicio6 = new Libro(12, 1949, "Hombres de maiz", "Miguel Angel Asturias", "Novela");
        ejercicio7 = new Fraccion(1, 3);
        Rectangulo r2 = ejercicio4; //segunda variable del tipo rectangulo
        System.out.println("\n------------CREANDO OBJETO RECTANGULO--------------\n");
        System.out.println("Rectangulo de dimensiones: " + ejercicio4.getAncho() + " × " + ejercicio4.getLargo());
        System.out.println("Rectangulo area: " + ejercicio4.getArea());
        System.out.println("Rectangulo perimetro: " + ejercicio4.getPerimetro());
        r2.setAncho(5.8); //modificando datos del objeto
        System.out.println("\n---------MODIFICANDO OBJETO RECTANGULO-------------\n");
        System.out.println("Rectangulo de dimensiones: " + ejercicio4.getAncho() + " × " + ejercicio4.getLargo());
        System.out.println("Rectangulo area: " + ejercicio4.getArea());
        System.out.println("Rectangulo perimetro: " + ejercicio4.getPerimetro()); 
    }

    public Contador getEjercicio1() {
        return ejercicio1;
    }

    public void setEjercicio1(Contador ejercicio1) {
        this.ejercicio1 = ejercicio1;
    }

    public Cuadrado getEjercicio2() {
        return ejercicio2;
    }

    public void setEjercicio2(Cuadrado ejercicio2) {
        this.ejercicio2 = ejercicio2;
    }

    public Circulo getEjercicio3() {
        return ejercicio3;
    }

    public void setEjercicio3(Circulo ejercicio3) {
        this.ejercicio3 = ejercicio3;
    }

    public Rectangulo getEjercicio4() {
        return ejercicio4;
    }

    public void setEjercicio4(Rectangulo ejercicio4) {
        this.ejercicio4 = ejercicio4;
    }

    public Contador2 getEjercicio5() {
        return ejercicio5;
    }

    public void setEjercicio5(Contador2 ejercicio5) {
        this.ejercicio5 = ejercicio5;
    }

    public Libro getEjercicio6() {
        return ejercicio6;
    }

    public void setEjercicio6(Libro ejercicio6) {
        this.ejercicio6 = ejercicio6;
    }

    public Fraccion getEjercicio7() {
        return ejercicio7;
    }

    public void setEjercicio7(Fraccion ejercicio7) {
        this.ejercicio7 = ejercicio7;
    }
    
}
