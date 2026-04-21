public class ErrorLecturaException extends Exception {
    private int codigoError;

    public ErrorLecturaException(int codigoError) {
        super("Fallo de conexión con el sensor. Código de error: " + codigoError);
        this.codigoError = codigoError;
    }

    public int getCodigoError() {
        return codigoError;
    }
}
