package co.com.choucair.certification.proyectobase.exceptions;

public class ValidarCursoSeleccionado extends AssertionError{

    public ValidarCursoSeleccionado(String message) {
        super(message);
    }

    public ValidarCursoSeleccionado(String message, Throwable cause) {
        super(message, cause);
    }
}
