package src;
/*
Crea una clase Libro con los métodos préstamo,
devolución y mostrarInformación. La clase
contendrá un constructor por defecto, un
constructor con parámetros y los métodos getters
y setters.
*/

public class Libro {
    public static void main(String[] args) {
        
    }
    private int id, anio;
    private String nombre, autor, categoria;
    private boolean estado = true;

    public Libro(){

    }
    public Libro(int id, int anio, String nombre, String autor, String categoria) {
        this.id = id;
        this.anio = anio;
        this.nombre = nombre;
        this.autor = autor;
        this.categoria = categoria;
    }
    public void mostrarInformacion(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Autor: " + autor);
        System.out.println("Anio: " + anio);
        System.out.println("Categoria: " + categoria);
        System.out.println("Estado: " + estadoActual() + "\n");
    }
    public void prestar(){
        estado = false;
    }
    public void devolver(){
        estado = true;
    }
    public String estadoActual(){
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
