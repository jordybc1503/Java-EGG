import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", "Perez"));
        personas.add(new Persona("Maria", "Gonzalez"));
        personas.add(new Persona("Carlos", "Ramirez"));

        // Creating a group of books
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", 417);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);
        Libro libro3 = new Libro("El Amor en los Tiempos del Cólera", "Gabriel Garcia Marquez", 348);
        Libro libro4 = new Libro("1984", "George Orwell", 328);
        Libro libro5 = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 576);

        // Adding the books to the library catalog
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);

        
        while (running) {
            System.out.println("Menú de Biblioteca");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Mostrar Catálogo");
            System.out.println("3. Prestar Libro");
            System.out.println("4. Devolver Libro");
            System.out.println("5. Mostrar Libros Prestados por Persona");
            System.out.println("6. Crear Persona");
            System.out.println("7. Borrar Persona");
            System.out.println("8. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Número de Páginas: ");
                    int numeroDePaginas = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    Libro libro = new Libro(titulo, autor, numeroDePaginas);
                    biblioteca.agregarLibro(libro);
                    break;
                case 2:
                    biblioteca.mostrarCatalogo();
                    break;
                case 3:
                    biblioteca.mostrarCatalogo();
                    System.out.print("Ingrese el título del libro a prestar: ");
                    String tituloPrestar = scanner.nextLine();

                    if (!personas.isEmpty()) {
                        System.out.println("Seleccione la persona que prestará el libro:");
                        for (int i = 0; i < personas.size(); i++) {
                            System.out.println((i + 1) + ". " + personas.get(i).getNombre() + " " + personas.get(i).getApellido());
                        }
                        int personaIndex = scanner.nextInt() - 1;
                        scanner.nextLine(); // Consume newline

                        if (personaIndex >= 0 && personaIndex < personas.size()) {
                            Persona personaSeleccionada = personas.get(personaIndex);

                            boolean libroEncontrado = false;
                            for (Libro l : biblioteca.getCatalogo()) {
                                if (l.getTitulo().equalsIgnoreCase(tituloPrestar)) {
                                    biblioteca.prestarLibro(l, personaSeleccionada);
                                    libroEncontrado = true;
                                    break;
                                }
                            }

                            if (!libroEncontrado) {
                                System.out.println("El libro no se encontró o ya está prestado.");
                            }
                        } else {
                            System.out.println("Persona no válida.");
                        }
                    } else {
                        System.out.println("No hay personas registradas. Cree una persona primero.");
                    }
                    break;
                    case 4:
                    if (!personas.isEmpty()) {
                        System.out.println("Seleccione la persona que devolverá el libro:");
                        for (int i = 0; i < personas.size(); i++) {
                            System.out.println((i + 1) + ". " + personas.get(i).getNombre() + " " + personas.get(i).getApellido());
                        }
                        int personaIndex = scanner.nextInt() - 1;
                        scanner.nextLine(); // Consume newline
                
                        if (personaIndex >= 0 && personaIndex < personas.size()) {
                            Persona personaSeleccionada = personas.get(personaIndex);
                
                            System.out.print("Ingrese el título del libro a devolver: ");
                            String tituloDevolver = scanner.nextLine();
                
                            boolean libroEncontrado = false;
                            for (Libro l : personaSeleccionada.getLibrosPrestados()) {
                                if (l.getTitulo().equalsIgnoreCase(tituloDevolver)) {
                                    biblioteca.devolverLibro(l, personaSeleccionada);
                                    libroEncontrado = true;
                                    break;
                                }
                            }
                
                            if (!libroEncontrado) {
                                System.out.println("El libro no se encontró en los préstamos de esta persona.");
                            }
                        } else {
                            System.out.println("Persona no válida.");
                        }
                    } else {
                        System.out.println("No hay personas registradas. Cree una persona primero.");
                    }
                    break;
                case 5:
                    if (!personas.isEmpty()) {
                        for (Persona p : personas) {
                            p.mostrarLibrosPrestados();
                        }
                    } else {
                        System.out.println("No hay personas registradas.");
                    }
                    break;
                case 6: // Crear Persona
                    System.out.print("Ingrese el nombre de la persona: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido de la persona: ");
                    String apellido = scanner.nextLine();
                    personas.add(new Persona(nombre, apellido));
                    System.out.println("Persona creada exitosamente.");
                    break;
                case 7: // Borrar Persona
                    if (!personas.isEmpty()) {
                        System.out.println("Seleccione la persona que desea borrar:");
                        for (int i = 0; i < personas.size(); i++) {
                            System.out.println((i + 1) + ". " + personas.get(i).getNombre() + " " + personas.get(i).getApellido());
                        }
                        int personaIndex = scanner.nextInt() - 1;
                        scanner.nextLine(); // Consume newline

                        if (personaIndex >= 0 && personaIndex < personas.size()) {
                            personas.remove(personaIndex);
                            System.out.println("Persona borrada exitosamente.");
                        } else {
                            System.out.println("Persona no válida.");
                        }
                    } else {
                        System.out.println("No hay personas registradas.");
                    }
                    break;
                case 8:
                    running = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
        scanner.close();
    }
}