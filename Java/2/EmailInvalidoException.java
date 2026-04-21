public class EmailInvalidoException extends Exception {
    public EmailInvalidoException(String email) {
        super("El email '" + email + "' no es válido. Debe contener '@' y '.'");
    }
}
