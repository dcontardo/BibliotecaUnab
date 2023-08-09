import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Usuario {
    private String rut;
    private String nombre;
    private char genero;
    private String carrera;
    public String prestamo;
    private String tipoUsuario;

    public Usuario(String rut, String nombre, char genero, String tipoUsuario, String carrera,String prestamo) {
        this.rut = rut;
        this.nombre = nombre;
        this.genero = genero;
        this.carrera = carrera;
        this.prestamo = prestamo;
        this.tipoUsuario = tipoUsuario;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public  String getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(String prestamo) {
        this.prestamo = prestamo;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", carrera='" + carrera + '\'' +
                ", prestamo=" + prestamo +
                ", profesion='" + tipoUsuario + '\'' +
                '}';
    }

    public static void crearUsuario(ArrayList<Usuario> listaUsuarios, Usuario nuevoUsuario) {

        listaUsuarios.add(nuevoUsuario);

        System.out.println("¡El usuario se ha creado exitosamente!");
        System.out.println(listaUsuarios);
    }

    public static void editarUsuario(ArrayList<Usuario> listaUsuarios, String nuevoNombre, char nuevoGenero, String nuevaCarrera) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombre().equals(nuevoNombre)) {
                usuario.setGenero(nuevoGenero);
                usuario.setCarrera(nuevaCarrera);
                System.out.println("¡El usuario se ha editado exitosamente!");
                System.out.println(listaUsuarios);
                return;
            }
        }
        System.out.println("No se encontró un usuario con ese nombre.");
    }

    public static void eliminarUsuario(ArrayList<Usuario> listaUsuarios, String nombreUsuario) {
        Scanner scanner = new Scanner(System.in);

        for (Iterator<Usuario> iterator = listaUsuarios.iterator(); iterator.hasNext(); ) {
            Usuario usuario = iterator.next();
            if (usuario.getNombre().equals(nombreUsuario)) {
                System.out.println("¿Estás seguro de eliminar al usuario " + usuario.getNombre() + "? (S/N): ");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("S")) {
                    iterator.remove(); // Elimina el usuario de la lista
                    System.out.println("¡El usuario se ha eliminado exitosamente!");
                    System.out.println(listaUsuarios);
                } else {
                    System.out.println("Eliminación cancelada.");
                    System.out.println(listaUsuarios);
                }
                return;
            }
        }
        System.out.println("No se encontró un usuario con ese nombre.");
    }


   /* método eliminar usuario sin validación
   public static void eliminarUsuario(ArrayList<Usuario> listaUsuarios, String nombreUsuario) {
        for (Iterator<Usuario> iterator = listaUsuarios.iterator(); iterator.hasNext();) {
            Usuario usuario = iterator.next();
            if (usuario.getNombre().equals(nombreUsuario)) {
                iterator.remove(); // Elimina el usuario de la lista
                System.out.println("¡El usuario se ha eliminado exitosamente!");
                System.out.println(listaUsuarios);
                return;
            }
        }
        System.out.println("No se encontró un usuario con ese nombre.");
    }

    */


    //validador de rut normal
    public boolean validarRUT(String rut) {
        if (rut == null || rut.isEmpty()) {
            return false;
        }

        String[] partes = rut.split("-");
        if (partes.length != 2) {
            return false;
        }

        String numero = partes[0];
        char dv = partes[1].charAt(0);

        int suma = 0;
        int multiplicador = 2;

        for (int i = numero.length() - 1; i >= 0; i--) {
            int digito = Integer.parseInt(String.valueOf(numero.charAt(i)));
            suma += digito * multiplicador;
            multiplicador = multiplicador == 7 ? 2 : multiplicador + 1;
        }

        int resto = suma % 11;
        int resultado = 11 - resto;

        char digitoVerificadorCalculado = resultado == 11 ? '0' : resultado == 10 ? 'K' : (char) ('0' + resultado);

        return digitoVerificadorCalculado == dv;
    }



    //metodo para validar genero
    public boolean validarGenero(char genero) {
        return genero == 'M' || genero == 'F';
    }

    //metodo para validar si es profesor o estudiante
    public boolean habilitado() {
        return esEstudiante() || esProfesor();
    }

    boolean esProfesor() {
        return tipoUsuario != null && tipoUsuario.equalsIgnoreCase("profesor");
    }

    boolean esEstudiante() {
        return tipoUsuario != null && tipoUsuario.equalsIgnoreCase("estudiante");
    }

    //método tiene libro
    boolean tieneLibro() {
        return !"0".equals(prestamo) && "ISBN".equals(prestamo);
    }


}