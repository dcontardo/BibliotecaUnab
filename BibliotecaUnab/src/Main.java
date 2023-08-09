import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.time.Period;


public class Main {

    public static void main(String[] args) {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Libro> listaLibros = new ArrayList<>();



        // Instanciar usuario - Estudiante
        Usuario nuevoUsuario = new Usuario("19427769-5", "David Contardo", 'S', "Estudiante", "Informática","0");
        // Instanciar usuario - profesor
        Usuario nuevoUsuario2 = new Usuario("19427769-5", "Pedro Pascal", 'S', "Profesor", "Química","ISBN");

        System.out.println(nuevoUsuario2.getPrestamo());
        System.out.println(nuevoUsuario2.tieneLibro());



        // validar profesion (estudiante o profesor)
        if (nuevoUsuario2.esProfesor()) {
            System.out.println(nuevoUsuario2.getNombre() + " es profesor.");
        } else if (nuevoUsuario2.esEstudiante()) {
            System.out.println(nuevoUsuario2.getNombre() + " es estudiante.");
        } else {
            System.out.println(nuevoUsuario2.getNombre() + " no es ni profesor ni estudiante.");
        }

        //validar género
        if (nuevoUsuario.validarGenero(nuevoUsuario.getGenero())) {
            System.out.println("Género válido");
        } else {
            System.out.println("Género inválido");
        }


        //validar rut
        if (nuevoUsuario.validarRUT(nuevoUsuario.getRut())) {
            System.out.println("RUT válido del usuario " + nuevoUsuario.getNombre());
        } else {
            System.out.println("RUT inválido del usuario " + nuevoUsuario.getNombre());
        }


        //crear usuario
        Usuario.crearUsuario(listaUsuarios, nuevoUsuario);

        //editar usuario
        Usuario.editarUsuario(listaUsuarios, "David Contardo", 'M', "Redes");

        //eliminar usuario
        Usuario.eliminarUsuario(listaUsuarios, "David Contardo");


        // Se instancia un libro
        Libro libro1 = new Libro("999555444421","Misery","Stephen King","XD");
        Libro libro2 = new Libro("663256554489","Quien se ha llevado mi queso","Marcianek","XD");
        Libro libro3 = new Libro("899555893327","La Biblia","no c","XD");

        //se agregan los libros al arreglo
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);

        System.out.println(listaLibros);

        // Validar si la cantidad de libros es mayor a 0
        if (listaLibros.size() > 0) {
            System.out.println("Hay libros en la lista.");
        } else {
            System.out.println("No hay libros en la lista.");
        }








    }

}


