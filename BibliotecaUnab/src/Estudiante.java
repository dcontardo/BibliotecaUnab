public class Estudiante extends Usuario {
    public Estudiante(String rut, String nombre, String prestamo, char genero, String tipoUsuario, String carrera) {
        super(rut, nombre, genero, tipoUsuario, carrera, prestamo);
    }
    private String carrera;
    @Override
    public String getCarrera() {
        return carrera;
    }
    @Override
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                '}';


    }
}



