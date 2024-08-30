import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> catalogo;

    public Biblioteca() {
        catalogo = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
    }

    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }

    public void mostrarCatalogo() {
        for (Libro libro : catalogo) {
            libro.mostrarInformacion();
            System.out.println();
        }
    }

    public void prestarLibro(Libro libro, Persona persona) {
        if (!libro.isPrestado()) {
            libro.setPrestado(true);
            persona.prestarLibro(libro);
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido prestado a " + persona.getNombre() + " " + persona.getApellido());
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' ya está prestado.");
        }
    }

    public void devolverLibro(Libro libro, Persona persona) {
        if (libro.isPrestado()) {
            libro.setPrestado(false);
            persona.devolverLibro(libro);
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido devuelto por " + persona.getNombre() + " " + persona.getApellido());
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no estaba prestado.");
        }
    }

    
}
