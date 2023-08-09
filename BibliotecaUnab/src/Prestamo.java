import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Calendar;
import java.time.temporal.ChronoUnit;
import java.time.Period;


public class Prestamo {
    private String ISBN;
    private String rutUsuarioSolicitante;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private int diasPrestamo;

    public Prestamo(String ISBN, String rutUsuarioSolicitante, Date fechaPrestamo, Date fechaDevolucion, int diasPrestamo) {
        this.ISBN = ISBN;
        this.rutUsuarioSolicitante = rutUsuarioSolicitante;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.diasPrestamo = diasPrestamo;
    }

    public Prestamo(String number, String rutUsuarioSolicitante, LocalDate of, LocalDate of1) {
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getRutUsuarioSolicitante() {
        return rutUsuarioSolicitante;
    }

    public void setRutUsuarioSolicitante(String rutUsuarioSolicitante) {
        this.rutUsuarioSolicitante = rutUsuarioSolicitante;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "ISBN='" + ISBN + '\'' +
                ", rutUsuarioSolicitante='" + rutUsuarioSolicitante + '\'' +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                ", diasPrestamo=" + diasPrestamo +
                '}';
    }


    public class DiferenciaFechas {
        public static void main(String[] args) {
            LocalDate fechaInicio = LocalDate.of(2020, 1, 1);
            LocalDate fechaFin = LocalDate.of(2023, 1, 1);

            Period periodo = Period.between(fechaInicio, fechaFin);

            System.out.println("Diferencia en años: " + periodo.getYears());
            System.out.println("Diferencia en meses: " + periodo.getMonths());
            System.out.println("Diferencia en días: " + periodo.getDays());
        }

    }
}
