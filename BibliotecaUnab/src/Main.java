import java.util.ArrayList;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        HashSet<String> rutSet = new HashSet<>();

        // Instanciar usuario - Alumno
        Usuario nuevoUsuario = new Usuario("19427769-2", "David Contardo", 'M', "Estudiante", "Informática");
        // Instanciar usuario - profesor
        Usuario nuevoUsuario2 = new Usuario("19427769-5", "Pedro Pascal", 'F', "Profesor", "Química");


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




    }

}
