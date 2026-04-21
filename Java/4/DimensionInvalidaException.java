public class DimensionInvalidaException extends Exception {
    public DimensionInvalidaException(String figura, String detalle) {
        super("Dimensión inválida en " + figura + ": " + detalle + " (debe ser > 0).");
    }
}
