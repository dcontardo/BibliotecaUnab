import java.util.ArrayList;
public class Docente extends Usuario{
    private String profesion = "";
    private ArrayList<String> gradoAcademico;
    public Docente(String rut, String nombre, char genero, String tipoUsuario, String carrera) {
        super(rut, nombre, genero, tipoUsuario, carrera);
        gradoAcademico = new ArrayList<>();
    }

    public Docente(String rut, String nombre, char genero, String tipoUsuario, String carrera, String profesion, ArrayList<String> grados) {
        super(rut, nombre, genero, tipoUsuario, carrera);
        this.profesion = profesion;
        this.gradoAcademico = grados;
        setGradoAcademico(grados);
    }

    @Override
    public String getProfesion() {
        return profesion;
    }

    @Override
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public ArrayList<String> getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(ArrayList<String> gradoAcademico) {
        for (String grado : gradoAcademico) {
            if (!grado.equalsIgnoreCase("magister") && !grado.equalsIgnoreCase("doctor")) {
                throw new IllegalArgumentException("Los grados deben ser 'magister' o 'doctor'.");
            }
        }
        this.gradoAcademico = gradoAcademico;
        System.out.println("El grado del profesor es:"+getProfesion());
    }

    @Override
    public String toString() {
        return "Docente{" +
                "profesion='" + profesion + '\'' +
                ", grados=" + gradoAcademico +
                '}';
    }
}
