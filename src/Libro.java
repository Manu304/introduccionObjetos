package src;
/*
Crea una clase Libro con los métodos préstamo,
devolución y mostrarInformación. La clase
contendrá un constructor por defecto, un
constructor con parámetros y los métodos getters
y setters.
*/

import java.util.Scanner;

public class Libro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idIngresado, anioIngresado;
        String nombreIngresado, autorIngresado, categoriaIngresada;
        System.out.println("\n-----------CREANDO LIBRO CON PARAMETROS-----------\n");
        System.out.print("Ingrese el ID: ");
        idIngresado = scanner.nextInt();
        System.out.print("Ingrese el nombre: ");
        scanner.nextLine();
        nombreIngresado = scanner.nextLine();
        System.out.print("Ingrese el autor: ");
        autorIngresado = scanner.nextLine();
        System.out.print("Ingrese el anio de publicacion: ");
        anioIngresado = scanner.nextInt();
        System.out.print("Ingrese la categoria: ");
        scanner.nextLine();
        categoriaIngresada = scanner.nextLine();
        Libro ejercicio6 = new Libro(idIngresado, anioIngresado, nombreIngresado, autorIngresado, categoriaIngresada);
        System.out.println("\n----------MOSTRANDO DATOS DEL LIBRO CREADO--------\n");
        ejercicio6.mostrarInformacion();
        System.out.println("\n-----------------PRESTAMO DEL LIBRO---------------\n");
        ejercicio6.prestar();
        ejercicio6.mostrarInformacion();
        System.out.println("\n---------------DEVOLUCION DEL LIBRO---------------\n");
        ejercicio6.devolver();
        ejercicio6.mostrarInformacion();
        System.out.println("\n------LIBRO CREADO CON CONSTRUCTOR POR DEFECTO-----\n");
        Libro ejemplo2 = new Libro();
        ejemplo2.mostrarInformacion();
        System.out.println("\n----------------------FIN-------------------------\n");
    }

    private int id, anio;
    private String nombre, autor, categoria;
    private boolean estado = true;

    public Libro() {
    }

    public Libro(int id, int anio, String nombre, String autor, String categoria) {
        this.id = id;
        this.anio = anio;
        this.nombre = nombre;
        this.autor = autor;
        this.categoria = categoria;
    }

    public void mostrarInformacion() {
        if (nombre != null) {
            System.out.println("ID: " + id);
            System.out.println("Nombre: " + nombre);
            System.out.println("Autor: " + autor);
            System.out.println("Anio: " + anio);
            System.out.println("Categoria: " + categoria);
            System.out.println("Estado: " + estadoActual() + "\n");

        } else {
            System.out.println("El libro no tiene datos para mostrar!\n");
        }

    }

    public void prestar() {
        estado = false;
        System.out.println("Se ha prestado el libro " + nombre);
    }

    public void devolver() {
        estado = true;
        System.out.println("Se ha devuelto el libro " + nombre);
    }

    public String estadoActual() {
        String estadoAct;
        if (estado == true) {
            estadoAct = "Disponible";
        } else {
            estadoAct = "No disponible";
        }
        return estadoAct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}