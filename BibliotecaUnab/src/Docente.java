import java.lang.reflect.Array;
import java.util.ArrayList;
public class Docente extends Usuario{
    private String profesion = "";
    private ArrayList<String> grados;
    public Docente(String rut, String nombre, String prestamo, char genero, String tipoUsuario, String carrera) {
        super(rut, nombre, genero, tipoUsuario, carrera, prestamo);
        grados = new ArrayList<>();
    }

    public Docente(String rut, String prestamo, String nombre, char genero, String tipoUsuario, String carrera, String profesion, ArrayList<String> grados) {
        super(rut, nombre, genero, tipoUsuario, carrera, prestamo );
        this.profesion = profesion;
        this.grados = grados;
        setGrados(grados);
    }

    public ArrayList<String> getGrados() {
        return grados;
    }

    public void setGrados(ArrayList<String> grados) {
        for (String grado : grados) {
            if (!grado.equalsIgnoreCase("magister") && !grado.equalsIgnoreCase("doctor")) {
                throw new IllegalArgumentException("Los grados deben ser 'magister' o 'doctor'.");
            }
        }
        this.grados = grados;
        System.out.println("El grado del profesor es:"+getProfesion());
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "profesion='" + profesion + '\'' +
                ", grados=" + grados +
                '}';
    }
}
