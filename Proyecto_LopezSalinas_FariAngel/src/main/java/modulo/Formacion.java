package modulo;

import java.time.LocalDate;

public class Formacion {
    private Long idFormacion;
    private Estudiante estudiante;
    private Empresa empresa;
    private TutorEmpresa tutorEmpresa;
    private Profesor coordinador;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private EstadoFormacion estado;
    private LocalDate fechaEvaluacion;
}
